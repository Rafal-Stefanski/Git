package udemy.java_programming_masterclass.section7.composition.house;

public class Main {
    public static void main(String[] args) {
        Window window = new Window(true);
        Room room_1 = new Room(2, 2, 2, window);
        House house_1 = new House("white", room_1);

        System.out.println("Is window open, in " + house_1.getColor() + " house? - " + house_1 );
    }
}
