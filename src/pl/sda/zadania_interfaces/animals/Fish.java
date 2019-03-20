package pl.sda.zadania_interfaces.animals;

public class Fish implements Animal, Swimmable {
    @Override
    public String getName() {
        return "Nemo";
    }

    @Override
    public String speak() {
        return "BulBul";
    }

    @Override
    public String swim() {
        return "Nemo pływa";
    }
}
