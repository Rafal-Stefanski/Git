package pl.sda.zadania_coinpo.Task2;

public class Tool2 {
    private String model;
    private double price;

    public Tool2(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String info() {
        return "Tool - `" + model + "` with the price = " + price;
    }
}
