public class Main{
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        float [] array = new float[size];
        float[][] newArr = shareArr(array);

        ThreadArr test1 = new ThreadArr(); //первые два потока с половинками массива
        ThreadArr test2 = new ThreadArr();
        ThreadArr test3 = new ThreadArr(); //поток работающий с целым массивом
        test1.setArr(newArr[0]);
        test2.setArr(newArr[1]);
        test3.setArr(array);
        test1.start();
        test2.start();
        test3.start();
        try {
            test1.join();
            test2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        array = overwriteArr(test1.getArr(), test2.getArr());


    }

    public static void calculateArr(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis());
    }

    public static float[][] shareArr(float[] arr){
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        float[][] newArr = new float[2][1];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        newArr[0] = a1;
        newArr[1] = a2;
        return newArr;
    }

    public static float[] overwriteArr(float[] newArr1, float[] newArr2){
        float[] oldArr = new float[size];
        System.arraycopy(newArr1, 0, oldArr, 0, h);
        System.arraycopy(newArr2, 0, oldArr, h, h);
        System.out.println(System.currentTimeMillis());
        return oldArr;
    }

//    public synchronized static float[][] overwriteArr(float[][] oldArr, float [] newArr, int x){
//        oldArr[x] = newArr;
//        return oldArr;
//    }
}
