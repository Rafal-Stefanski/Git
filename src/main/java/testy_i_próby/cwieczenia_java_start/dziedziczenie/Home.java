package testy_i_próby.cwieczenia_java_start.dziedziczenie;

/**
 * Getery, settery i konstruktory.
 * https://www.youtube.com/watch?v=bPHr64sReSs
 */


public class Home {
    public static void main(String[] args) {

        TV nosy = new TV(42,"nosy123");
        TV sama = new TV(32, "sama2345");

        System.out.println(sama.getName() + " " +  sama.getSize());
        System.out.println(nosy.getName() + " " +  nosy.getSize());

        sama.getOnOff();
        sama.setOnOff(true);
        sama.getOnOff();

        Dog rex = new Dog();
        rex.speak();
        rex.setSize(15);
        System.out.println(rex.getSize());

    }
}
