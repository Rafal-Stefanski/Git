package pl.sda.zadania_coinpo.toolshop;

public class Saw extends Tool {
    private int length;

    @Override
    public String description() {
        return super.description() + "saw lenght:" + length;
    }

    public Saw(String model, double price, int length) {
        super(model, price);
        this.length = length;


    }
}
