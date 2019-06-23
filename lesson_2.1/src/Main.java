import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer[] someNumbers = {1, 2, 3, 4, 5};
        SwapBox<Integer> swapInBox = new SwapBox<>();
        System.out.println(someNumbers[0] + " " + someNumbers[4]);

        swapInBox.swappedObj(someNumbers, 0, 4);
        System.out.println(someNumbers[0] + " " + someNumbers[4]);

        String[] someStr = {"H","e","l","l","o"};
        SwapBox<String> swapStrBox = new SwapBox<>();
        System.out.println(someStr[3] + someStr[4]);

        swapStrBox.swappedObj(someStr, 3, 4);
        System.out.println(someStr[3] + someStr[4]);



        ArrayList<Integer> arrayList;
        ConvertArrList<Integer> convertArrList = new ConvertArrList<>();
        arrayList = convertArrList.startConvert(someNumbers);
        for (Integer i: arrayList) {
            System.out.print(i);
        }
        System.out.println();


        ArrayList<String> arrayList1;
        ConvertArrList<String> convertArrList1 = new ConvertArrList<>();
        arrayList1 = convertArrList1.startConvert(someStr);
        for (String i: arrayList1) {
            System.out.print(i);
        }
    }
}
