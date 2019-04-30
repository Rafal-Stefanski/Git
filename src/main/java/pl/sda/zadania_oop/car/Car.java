package pl.sda.zadania_oop.car;

/*
1. Utwórz klasę Car z polami: brand i color {na katalogu}(Alt + Insert → Java Class lub PPM → New → Java Class)
2. Dodaj konstruktor i oba pola jako argumenty{w klasie}(Alt + Insert → Constructor lub PPM → Generate → Constructor)
3. Dodaj metodę toString() i dodaj oba pola {w klasie}(Alt + Insert → toString() lub PPM → Generate → toString())
4. W klasie CarHelloWorldApp utwórz nowy obiekt na podstawie klasy Car, np. Car toyota = new Car("Toyota", "black");
5. Wypisz na konsoli informację o samochodzie System.out.println("My car is: " + toyota);
6. Uruchom program {w klasie}(Alt + Shift + F10 lub PPM → Run Car.main())
 */

// [mod_dost] typ nazwa_pola [= inicjator]

public class Car {
    private String brand;
    private String color;
    private int speed;

    private boolean isMoving = true;
    private boolean carIsOpen = false;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (isMoving) {
            this.speed = speed;
        } else {
            System.out.println("Can't set speed!");
        }
    }

    public void start() {
        isMoving = true;
        System.out.println("Car was started!");
    }

    public void stop() {
        isMoving = false;
        System.out.println("Car stop!");
    }

    public void openDoor() {
        carIsOpen = true;
        System.out.println("Door is open, get in!");

    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "brand='" + brand + '\'' +
//                ", color='" + color + '\'' +
//                ", speed=" + speed +
//                ", isMoving=" + isMoving +
//                '}';
//    }

}

