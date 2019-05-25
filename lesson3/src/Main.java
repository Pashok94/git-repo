import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Кот");
        arrayList.add("Собака");
        arrayList.add("Волк");
        arrayList.add("Кот");
        arrayList.add("Лев");
        arrayList.add("Бегемот");
        arrayList.add("Ворон");
        arrayList.add("Тигр");
        arrayList.add("Кот");
        arrayList.add("Ворон");
        arrayList.add("Лев");
        arrayList.add("Мышь");
        arrayList.add("Кот");
        arrayList.add("Волк");
        arrayList.add("Лиса");
        arrayList.add("Лев");

        checkList(arrayList);
    }


    public static void checkList(ArrayList arrayList){
        ArrayList<String> newArrayList = new ArrayList<>();
        String list = "Уникальные слова: ";
        int reiteration;

        for(int i = 0; i < arrayList.size(); i++){
            reiteration = 0;

            for (int j = 0; j < arrayList.size(); j++){
                if(arrayList.get(i).equals(arrayList.get(j)))
                    reiteration++;
            }

            if(reiteration > 1 ) {
                String str = arrayList.get(i) + " " + reiteration;
                if(!newArrayList.contains(str))
                    newArrayList.add(str);
            }
            else
                list += arrayList.get(i) + " ";
        }
        System.out.println(newArrayList);
        System.out.println(list);
    }
}
