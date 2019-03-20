package pl.sda.zadania_interfaces.animals;

public class Insect implements Animal, Flyable {
    @Override
    public String getName() {
        return "Pszczółka Maja";
    }

    @Override
    public String speak() {
        return "trrr";
    }

    @Override
    public String fly() {
        return "Maja lata";
    }
}
