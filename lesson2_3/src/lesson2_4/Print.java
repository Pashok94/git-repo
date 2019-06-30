package lesson2_4;

public class Print implements Runnable {

    BilderStr bilderStr;
    String str;
    int number;

    public Print(BilderStr bilderStr, String str, int number) {
        this.bilderStr = bilderStr;
        this.str = str;
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            bilderStr.appendStr(this.str, this.number, i);
        }
    }
}
