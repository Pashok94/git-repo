import java.io.*;
import java.util.Scanner;

public class ReadBook {
    Scanner scanner = new Scanner(System.in);
    String str = "yes";

    public void startRead(String title) {
        byte[] buf = new byte[22];

        try (FileInputStream in = new FileInputStream(title)) {
            int count;
            while ((count = in.read(buf)) > 0 && str.equals("yes")) {
                for (int i = 0; i < count; i++) {
                    System.out.print((char) buf[i]);
                }
                str = "no";
                System.out.println("Go next page? ");
                str = scanner.nextLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
