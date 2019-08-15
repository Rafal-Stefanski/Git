package testy_i_próby.cwieczenia_java_start.dziedziczenie;

public class Dog extends Animal { // zapis extends to dziedziczenia po klasie Animal

    @Override
    public void speak() {
//        super.speak();
        System.out.println("Woof, woof!");
    }
}
