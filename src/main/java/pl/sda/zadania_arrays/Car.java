package pl.sda.zadania_arrays;

public class Car {
    private String brand;
    private String name;

    public Car(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
