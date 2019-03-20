package pl.sda.zadania_coinpo.Task2;

public class Saw extends Tool {
    private int lenght;

    public Saw(String model, double price, int lenght) {
        super(model, price);
        this.lenght = lenght;
    }
}
