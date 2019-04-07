package pro1.list;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product o) {
        if(o == null) {
            return 1;
        }

        return id - o.getId();
    }

    @Override
    public String toString() {
        return String.format("[%d, %s - %.2f]",id, name, price);
    }
}
