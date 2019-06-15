package Lesson2;

public class TestDrive {
    public static void main(String[] args) {
        int [][] newArray = new int[4][4];
        String[][] array = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        try {
            newArray = WorkWithArrays.WorkWithArrays(array);
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }


        for(int i = 0; i < newArray.length; i++ ) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
