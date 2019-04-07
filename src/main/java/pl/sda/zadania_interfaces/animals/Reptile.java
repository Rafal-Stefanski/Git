package pl.sda.zadania_interfaces.animals;

public class Reptile implements Animal, Swimmable {
    @Override
    public String getName() {
        return "Gekon Maniek";
    }

    @Override
    public String speak() {
        return "!";
    }

    @Override
    public String swim() {
        return "Gekon pływa";
    }
}
