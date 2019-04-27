package pl.sda.zadania_oop.car;

public class CarManager {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "white");
        Car car2 = new Car("BMW", "black");

        car1.setSpeed(50);
        car2.setSpeed(75);

        System.out.println(car1);
        System.out.println(car2);

        car1.start();
        car2.start();

        car1.setSpeed(50);
        car2.setSpeed(75);

        System.out.println(car1);
        System.out.println(car2);
    }
}
