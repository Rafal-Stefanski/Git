package udemy.java_programming_masterclass.section6.inheritance_p1.challenge_onemore;

public class Vehicle {
    String name;
    String size;

    int currentSpeed;
    int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int steerDirectionInDegrees) {
        this.currentDirection += steerDirectionInDegrees;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int currentSpeed, int currentDirectionInDegrees) {
        this.currentSpeed += currentSpeed;
        this.currentDirection += currentDirectionInDegrees;

        System.out.println("Vehicle.move(): Moving at: " + currentSpeed + " in direction " + currentDirection);
    }

    public void stop() {
        this.currentSpeed = 0;
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
