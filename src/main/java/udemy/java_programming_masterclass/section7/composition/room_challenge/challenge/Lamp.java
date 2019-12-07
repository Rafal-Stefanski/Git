package udemy.java_programming_masterclass.section7.composition.room_challenge.challenge;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning ON");
    }
    public String getStyle() {
        return this.style;
    }

    public boolean isBattery() {
        return this.battery;
    }

    public int getGlobRating() {
        return this.globRating;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public void setGlobRating(int globRating) {
        this.globRating = globRating;
    }
}
