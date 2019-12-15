package udemy.java_programming_masterclass.section7.polimorphism.oop_master_challenge;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private int lettuce;
    private int tomato;
    private int carrot;
    private int pickle;

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

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setCarrot(int carrot) {
        this.carrot = carrot;
    }

    public void setPickle(int pickle) {
        this.pickle = pickle;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        double basePrice = 4.5;
        double baseAdditionsPrice = lettuce * 0.5 + tomato * 0.8 + carrot * 0.5 + pickle * 0.3;
//        System.out.println("Classic Burger price = " + basePrice + "\n Additions price = " + baseAdditionsPrice);
        return price = basePrice + baseAdditionsPrice;
    }
}

class BaseBurger extends Hamburger {
    public BaseBurger(double price, int lettuce, int tomato, int carrot, int pickle) {
        super("Base Burger Classic", "Regular white bread", "ground veal", price);
        super.setLettuce(lettuce);
        super.setTomato(tomato);
        super.setCarrot(carrot);
        super.setPickle(pickle);
    }
}






