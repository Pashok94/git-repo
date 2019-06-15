public class SwapBox<T> {
    private T obj1;
    private T obj2;

    public T swappedObj(T[]arr, int indexFirstElement, int indexSecondElement){
        if(indexFirstElement < arr.length && indexSecondElement < arr.length) {
            obj1 = arr[indexFirstElement];
            obj2 = arr[indexSecondElement];
            arr[indexFirstElement] = obj2;
            arr[indexSecondElement] = obj1;
        }else
            System.out.println("Один из индексов находится вне значений массива");

        return (T) arr;
    }
}
