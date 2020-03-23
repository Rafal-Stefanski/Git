package udemy.java_programming_masterclass.section6.inheritance_p1.challenge_third_attempt;

public class Vehicle {
    private String name;
    private String size;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void speed(int velocity) {
        System.out.println("vehicle moves at speed: " + velocity);
    }

    public void steering(int turn) {
        System.out.println("Vehicle turns: " + turn + " degrees.");
    }
}
