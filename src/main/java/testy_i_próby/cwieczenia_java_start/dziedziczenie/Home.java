package testy_i_próby.cwieczenia_java_start.dziedziczenie;

/**
 * Getery, settery i konstruktory.
 * https://www.youtube.com/watch?v=bPHr64sReSs
 */


public class Home {
    public static void main(String[] args) {

        TV nosy = new TV(42, "Sony");
        TV sama = new TV(32, "Samsung");

        System.out.println("Show TV name: " + sama.getName() + " , and size: " + sama.getSize());
        sama.getOnOff(); //sprawdzamy stan telewizora -boolean domyślnie jest false wiec wyłączony
        sama.setOnOff(true); //właczamy tv używając setera
        sama.getOnOff();    // tym razem TV jest włączony
        System.out.println("Show TV name: " + nosy.getName() + " , and size: " + nosy.getSize());
        nosy.getOnOff();
        System.out.println("Dog react..");
        Dog rex = new Dog(); // nowy obiekt rex z Klasy Dog która dziedziczy po klasie Animal.
        rex.speak(); // nadpisana metoda Animal w klasie Dog, dlatego Woof Woof zamiast "  "
        rex.setSize(15); //pobrane z klasy Animal
        System.out.println(rex.getSize());

    }
}
