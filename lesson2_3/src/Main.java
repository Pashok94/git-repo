import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
//        try {
//            byte[] arr = new byte[5];
//            FileInputStream in = new FileInputStream("TestFile");
//            int count;
//            while ((count = in.read(arr)) > 0){
//                for (int i = 0; i < count; i++) {
//                    System.out.print((char) arr[i]);
//                }
//            }
//            in.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        File filesArr[] = {new File("file1"), new File("file2"), new File("file3")
                , new File("file4"), new File("file5")};

        try {
            FileOutputStream out = new FileOutputStream("shared_file", true);
            for (File file : filesArr) {
                FileInputStream in = new FileInputStream(file);
                int x;
                while ((x = in.read()) != -1) {
                    System.out.print((char) x);
                    out.write(x);
                }
                in.close();
            }
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
