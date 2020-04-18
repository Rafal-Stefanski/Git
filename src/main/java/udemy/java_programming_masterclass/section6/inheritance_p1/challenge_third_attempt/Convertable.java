package udemy.java_programming_masterclass.section6.inheritance_p1.challenge_third_attempt;

import java.sql.Struct;

public class Convertable extends Car {
    private String roofType;

    public Convertable(String name, String size, String model, int wheels, boolean isAutomatic, int gear, String roofType) {
        super(name, size, model, wheels, isAutomatic, gear);
        this.roofType = roofType;
    }

    public void openRoof(boolean isOpen) {
        System.out.println("You have retractable " + this.roofType + " roof, in your " + this.getModel() + ". You chose to: ");
        if (!isOpen) {
            System.out.println("- Close it. It's closed.");
        } else {
            System.out.println("- Open it. It's opened.");
        }
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;
        if (newSpeed == 0) {
            stop();
        } else if (newSpeed > 0 && newSpeed <= 30) {
            changeGear(1);
        } else if (newSpeed > 30 && newSpeed < 45) {
            changeGear(2);
        }
    }

}
