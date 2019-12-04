package udemy.java_programming_masterclass.section7.composition.house;

public class Room {
    private int width;
    private int length;
    private int height;


    private Window window;

    public Room(int width, int length, int height, Window window) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.window = window;
    }




}
