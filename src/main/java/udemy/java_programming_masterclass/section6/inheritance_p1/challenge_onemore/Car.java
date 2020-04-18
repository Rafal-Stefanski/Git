package udemy.java_programming_masterclass.section6.inheritance_p1.challenge_onemore;

public class Car extends Vehicle {
    int wheels;
    int doors;
    int gears;
    boolean isManual;

    int currentGear;


    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }


}
