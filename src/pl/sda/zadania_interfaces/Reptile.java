package pl.sda.zadania_interfaces;

public class Reptile implements Animal {

    @Override
    public String getName() {
        return "Gad";
    }

    @Override
    public String speak() {
        return "Ssss!";
    }
}
