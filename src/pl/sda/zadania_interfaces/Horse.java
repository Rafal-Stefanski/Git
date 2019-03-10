package pl.sda.zadania_interfaces;

public class Horse implements Animal {

    @Override
    public String getName() {
        return "Konik";
    }

    @Override
    public String speak() {
        return "ihaha!";
    }
}
