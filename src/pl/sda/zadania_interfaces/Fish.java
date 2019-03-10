package pl.sda.zadania_interfaces;

public class Fish implements Animal {

    @Override
    public String getName() {
        return "Rybka";
    }

    @Override
    public String speak() {
        return "mute!";
    }
}
