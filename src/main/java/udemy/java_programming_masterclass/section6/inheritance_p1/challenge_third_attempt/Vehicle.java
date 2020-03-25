package udemy.java_programming_masterclass.section6.inheritance_p1.challenge_third_attempt;

public class Vehicle {
    private String name;
    private String size;

    int currentSpeed;
    int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentSpeed =0;
        this.currentDirection =0;
    }

    public void speed(int velocity) {
        System.out.println("vehicle moves at speed: " + velocity);
    }

    public void stop() {
        this.currentSpeed = 0;
    }


    public void steering(int turn) {
        System.out.println("Vehicle turns: " + turn + " degrees.");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
