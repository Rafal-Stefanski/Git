package pl.sda.zadania_interfaces;

public class Bird implements Animal {

    @Override
    public String getName() {
        return "Orzełek";
    }

    @Override
    public String speak() {
        return "iiikh!";
    }
}
