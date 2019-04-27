package pl.sda.zadania_oop;

import pl.sda.zadania_oop.car.Car;

public class CarHelloWorldApp {
    public static void main(String[] args) {

        Car toyota = new Car("Toyota", "black");
        System.out.println("My car is: " + toyota);

//        Car suzuki = new Car ("Suzuki", "red");
//        System.out.println("My car is: " + suzuki);

    }

}
