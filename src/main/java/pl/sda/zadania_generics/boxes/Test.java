package pl.sda.zadania_generics.boxes;

public class Test {
    public static void main(String[] args) {

        Orange orange = new Orange();
        Apple apple = new Apple();
        Strawberry strawberry = new Strawberry();

        Box<Apple> appleBox = new Box<>(apple);
        Apple apple1 = appleBox.getItem();

        Box<Orange> orangeBox = new Box<>(orange);
        Box box = new Box(strawberry);
        Object item = box.getItem();
    }
}
