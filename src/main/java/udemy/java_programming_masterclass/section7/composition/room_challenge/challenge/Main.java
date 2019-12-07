package udemy.java_programming_masterclass.section7.composition.room_challenge.challenge;

public class Main {
    public static void main(String[] args) {
        WallWithDoors wallWithDoors = new WallWithDoors("West");
        Lamp lamp = new Lamp("Classic", false, 75);

        Kitchen kitchen = new Kitchen("My kitchen", wallWithDoors, lamp);
        kitchen.makeSandwich();
        kitchen.getLamp().turnOn();
    }
}
