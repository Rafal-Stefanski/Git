package pl.sda.zadania_oop.car;

public class CarManager {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "white");
        Car car2 = new Car("BMW", "black");
        Car myCar = new Car("Ford", "Black");
        Car neighbourCar = new Car("Skoda", "Red");

        myCar.openDoor();

        car1.setSpeed(50);
        car2.setSpeed(75);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(myCar);
        System.out.println(neighbourCar);

        car1.start();
        car2.start();
        myCar.start();
        neighbourCar.start();

        car1.setSpeed(50);
        car2.setSpeed(75);

        myCar.setSpeed(40);
        neighbourCar.setSpeed(30);
        neighbourCar.stop();

        System.out.println(car1);
        System.out.println(car2);
    }
}
