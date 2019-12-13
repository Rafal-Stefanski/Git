package udemy.java_programming_masterclass.section7.polimorphism.oop_master_challenge;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private int lettuce;
    private int tomato;
    private int carrot;
    private int pickle;
    private double price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price = 4.5 + lettuce * 0.5 + tomato * 0.8 + carrot * 0.5 + pickle * 0.3;
    }
}

class BaseBurger extends Hamburger {
    public BaseBurger(double price, int lettuce, int tomato, int carrot, int pickle) {
        super("Base Burger Classic", "Regular white bread", "ground veal", price);

    }
}


