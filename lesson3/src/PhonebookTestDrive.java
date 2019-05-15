import java.util.ArrayList;

public class PhonebookTestDrive {
    public static void main(String[] args) {
        ArrayList <Subscriber> phonebook = new ArrayList<>();
        phonebook.add(new Subscriber("Иванов", 89993459874L));
        phonebook.add(new Subscriber("Петров", 89993455674L));
        phonebook.add(new Subscriber("Кузнецов", 89993459874L));
        phonebook.add(new Subscriber("Воронин", 89993434874L));
        phonebook.add(new Subscriber("Беглов", 89953459874L));
        phonebook.add(new Subscriber("Иванов", 89978459874L));
        phonebook.add(new Subscriber("Цаплин", 89993459874L));
        phonebook.add(new Subscriber("Воронин", 89909769874L));
        phonebook.add(new Subscriber("Иванов", 89993454564L));
        phonebook.add(new Subscriber("Петров", 89993123974L));

        findSubsriber(phonebook, "Иванов");

    }
    public static void findSubsriber(ArrayList<Subscriber> arrayList, String name){
        for (int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).name.equals(name))
                System.out.println(arrayList.get(i).name + " " + arrayList.get(i).phoneNumber);
        }
    }

}
