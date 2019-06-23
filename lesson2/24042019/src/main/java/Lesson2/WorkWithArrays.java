package Lesson2;

public abstract class WorkWithArrays {
    public static int[][] WorkWithArrays (String[][]arr) throws MyArraySizeException, MyArrayDataException{
        if (arr.length != 4 || arr[0].length!= 4|| arr[1].length!= 4 || arr[2].length!= 4|| arr[3].length!= 4)
            throw new MyArraySizeException("Размер вашего массива должен быть 4х4");

        int [][] newArr = new int[4][4];

        for(int i = 0; i < arr.length; i++ ){
            for(int j = 0; j < arr[i].length; j++){
                try {
                    newArr[i][j] = Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("В ячейке ( " + i + ": " + j + ") должно быть число");
                }
            }
        }
        return newArr;
    }
}
