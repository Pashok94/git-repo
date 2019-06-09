public class FruitBoxTestDrive {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        FruitBox<Orange> orangeFruitBox = new FruitBox<>();

        appleFruitBox.addFruit(apple1);
        appleFruitBox.addFruit(apple2);
        appleFruitBox.addFruit(apple3);

        orangeFruitBox.addFruit(orange1);
        orangeFruitBox.addFruit(orange2);
        orangeFruitBox.addFruit(orange3);

        System.out.println(appleFruitBox.getWeight() + " " + orangeFruitBox.getWeight());
        System.out.println(appleFruitBox.compare(orangeFruitBox));

        FruitBox<Orange> newOrangeFruitBox = new FruitBox<>();
        orangeFruitBox.removeFruit(newOrangeFruitBox);
        System.out.println(orangeFruitBox.getWeight() + " " + newOrangeFruitBox.getWeight());
    }
}
