package lesson2_4;

public class BilderStr {

    StringBuilder stringBuilder = new StringBuilder();

    public synchronized void appendStr(String str, int number, int i){
        while ((stringBuilder.length() - (i*3)) != number) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.stringBuilder.append(str);
        notifyAll();
    }
    public void printStr(){
        System.out.println(stringBuilder.toString());
    }
}
