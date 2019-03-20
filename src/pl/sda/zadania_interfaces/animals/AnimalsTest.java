package pl.sda.zadania_interfaces.animals;

public class AnimalsTest {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();
        Horse horse = new Horse();
        Reptile reptile = new Reptile();
        Insect insect = new Insect();

        Animal[] animals = {bird, fish, horse, reptile, insect};

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says: " + animal.speak());
        }

        makeThemSwim(fish, reptile);
    }

    public static void makeThemSwim(Swimmable... animalsThatSwim) {
        for (Swimmable swimmable : animalsThatSwim) {
            System.out.println(swimmable.swim());
        }
    }
}
