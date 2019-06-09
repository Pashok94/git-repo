import java.util.ArrayList;

public class FruitBox <T extends Fruit> {
    ArrayList<T> arrayList = new ArrayList<T>();

    public void addFruit(T fruit){
        arrayList.add(fruit);
    }

    public float getWeight(){
        float sumWeight = 0.0f;
        for (T obj: arrayList) {
            sumWeight += obj.weight;
        }
        return sumWeight;
    }

    public boolean compare(FruitBox fruitBox){
        return this.getWeight() == fruitBox.getWeight();
    }

    public void removeFruit(FruitBox<T> newFruitBox){
        for (T obj : this.arrayList) {
            newFruitBox.addFruit(obj);
        }
        for (int i = 0; i < arrayList.size();){
            arrayList.remove(i);
        }
    }
}
