package pro1.arrays;

public class Car {
    private String brand;
    private int yearOfProduction;
    private int rating;

    public Car(String brand, int yearOfProduction, int rating) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("%-12s (rating: %02d) - year of production: %d", brand, rating, yearOfProduction);
    }
}

