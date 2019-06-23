package lesson2_4;

public class MainThreads {
    public static void main(String[] args) {

        BilderStr bilderStr = new BilderStr();

        Print printA = new Print(bilderStr, "A", 0);
        Print printB = new Print(bilderStr, "B", 1);
        Print printC = new Print(bilderStr, "C", 2);

        new Thread(printA).start();
        new Thread(printB).start();
        new Thread(printC).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bilderStr.printStr();
    }
}
