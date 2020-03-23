package udemy.java_programming_masterclass.section6.inheritance_p1.challenge_third_attempt;

public class Car extends Vehicle {
    private String model;
    private int wheels;
    private boolean isAutomatic;
    private int gear;

    public Car(String name, String size, String model, int wheels, boolean isAutomatic, int gear) {
        super(name, size);
        this.model = model;
        this.wheels = wheels;
        this.isAutomatic = isAutomatic;
        this.gear = gear;
    }

    public void changeGear(int gear) {
        if (isAutomatic = true) {
            System.out.println("You picked the " + gear + " gear.");
        } else {
            System.out.println("It's automatic.");
        }
    }

    public String getModel() {
        return model;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public int getGear() {
        return gear;
    }
}
