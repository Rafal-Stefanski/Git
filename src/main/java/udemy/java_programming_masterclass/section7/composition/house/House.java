package udemy.java_programming_masterclass.section7.composition.house;

public class House {
    private String color;
    private Room room;

    public House(String color, Room room) {
        this.color = color;
        this.room = room;
    }

    public String getColor() {
        return color;
    }

    public Room getRoom() {
        return room;
    }
}
