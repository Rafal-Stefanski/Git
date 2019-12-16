package udemy.java_programming_masterclass.section7.polimorphism.oop_master_challenge;

import com.sun.org.apache.xpath.internal.objects.XNull;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private String addition1;
    private double addition1Price;
    private String addition2;
    private double addition2Price;
    private String addition3;
    private double addition3Price;
    private String addition4;
    private double addition4Price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void setAddition1(String addition1, double addition1Price) {
        this.addition1 = addition1;
        this.addition1Price = addition1Price;
    }

    public void setAddition2(String addition2, double addition2Price) {
        this.addition2 = addition2;
        this.addition2Price = addition2Price;
    }

    public void setAddition3(String addition3, double addition3Price) {
        this.addition3 = addition3;
        this.addition3Price = addition3Price;
    }

    public void setAddition4(String addition4, double addition4Price) {
        this.addition4 = addition4;
        this.addition4Price = addition4Price;
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
        return price;
    }


    public double getPriceWithAdditions() {
        if (addition1 != null) {
            this.price += this.addition1Price;
        }
        if (addition2 != null) {
            this.price += this.addition2Price;
        }
        if (addition3 != null) {
            this.price += this.addition3Price;
        }
        if (addition4 != null) {
            this.price += this.addition4Price;
        }
        return price;
    }

    public String getNameOfAdditions() {
        if (this.addition1 == null) {
            return "nothing added.";
        }
        if (this.addition2 == null) {
            return this.addition1 + ", priced: " + this.addition1Price + " PLN.";
        }
        if (this.addition3 == null) {
            return this.addition1 + ", priced: " + this.addition1Price + " PLN" + "\n" +
                    this.addition2 + ", priced: " + this.addition2Price + " PLN";
        }
        if (this.addition4 == null) {
            return this.addition1 + ", priced: " + this.addition1Price + " PLN" + "\n" +
                    this.addition2 + ", priced: " + this.addition2Price + " PLN" + "\n" +
                    this.addition3 + ", priced: " + this.addition3Price + " PLN";

        } else {
            return this.addition1 + ", priced: " + this.addition1Price + " PLN" + "\n" +
                    this.addition2 + ", priced: " + this.addition2Price + " PLN" + "\n" +
                    this.addition3 + ", priced: " + this.addition3Price + " PLN" + "\n" +
                    this.addition4 + ", priced: " + this.addition4Price + " PLN";

        }
    }

}

class HealthyBurger extends Hamburger {
    private String addition5;
    private double addition5Price;
    private String addition6;
    private double addition6Price;

    public HealthyBurger(String name, String breadRollType, String meat, double price) {
        super(name, breadRollType, meat, price);
    }

//    @Override
//    public void setAddition1(String addition1, double addition1Price) {
//        super.setAddition1(addition1, addition1Price);
//    }
//
//    @Override
//    public void setAddition2(String addition2, double addition2Price) {
//        super.setAddition2(addition2, addition2Price);
//    }
//
//    @Override
//    public void setAddition3(String addition3, double addition3Price) {
//        super.setAddition2(addition3, addition3Price);
//    }
//
//    @Override
//    public void setAddition4(String addition4, double addition4Price) {
//        super.setAddition4(addition4, addition4Price);
//    }

    public void setAddition5(String addition5, double addition5Price) {
        this.addition5 = addition5;
        this.addition5Price = addition5Price;
    }

    public void setAddition6(String addition6, double addition6Price) {
        this.addition6 = addition6;
        this.addition6Price = addition6Price;
    }

//    @Override
//    public String getName() {
//        return super.getName();
//    }
//
//    @Override
//    public String getBreadRollType() {
//        return super.getBreadRollType();
//    }
//
//    @Override
//    public String getMeat() {
//        return super.getMeat();
//    }
//
//    @Override
//    public double getPrice() {
//        return super.getPrice();
//    }

    @Override
    public double getPriceWithAdditions() {
        double healthyBurgerAdditionsPrice = super.getPriceWithAdditions();
        if (this.addition5 != null) {
            healthyBurgerAdditionsPrice += this.addition5Price;
        }
        if (this.addition6 != null) {
            healthyBurgerAdditionsPrice += this.addition6Price;
        }
        return healthyBurgerAdditionsPrice;
    }

    @Override
    public String getNameOfAdditions() {
        if (this.addition5 == null) {
            return super.getNameOfAdditions();
        }
        if (this.addition6 == null) {
            return super.getNameOfAdditions() + "\n" +
                    this.addition5 + ", priced: " + this.addition5Price + " PLN";
        } else {
            return super.getNameOfAdditions() + "\n" +
                    this.addition5 + ", priced: " + this.addition5Price + " PLN" + "\n" +
                    this.addition6 + ", priced: " + this.addition6Price + " PLN";
        }
    }
}

class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String name, String breadRollType, String meat, double price) {
        super(name, breadRollType, meat, price);
    }



}






