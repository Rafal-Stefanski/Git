package pro1.set;

public class Car {
    private String brand;
    private String color;
    private String vin;

    public Car(String brand, String color, String vin) {
        this.brand = brand;
        this.color = color;
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getVin() {
        return vin;
    }
}
