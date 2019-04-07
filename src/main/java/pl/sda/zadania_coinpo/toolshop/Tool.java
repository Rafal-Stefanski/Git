package pl.sda.zadania_coinpo.toolshop;

public class Tool {
    private String model;
    private double price;

    public Tool(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
    public String description(){
        return "Tool" + model + "cena:" + price;

    }
}
