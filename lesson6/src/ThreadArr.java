public class ThreadArr extends Thread {

    private float[] arr;

    public void setArr(float[]arr){
        this.arr = arr;
    }

    public float[] getArr(){
        return arr;
    }

    @Override
    public void run() {
        super.run();
        Main.calculateArr(arr);
    }
}
