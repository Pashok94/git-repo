import java.util.ArrayList;

public class ConvertArrList<T> {
    ArrayList <T> arrayList = new ArrayList<T>();

    public ArrayList <T> startConvert(T[] arr){
        for (T obj: arr) {
            arrayList.add(obj);
        }
        return arrayList;
    }

}
