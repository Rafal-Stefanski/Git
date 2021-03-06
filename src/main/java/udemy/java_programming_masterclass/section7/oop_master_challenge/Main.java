package udemy.java_programming_masterclass.section7.oop_master_challenge;

public class Main {
    public static void main(String[] args) {
        // check code
        Hamburger classicBurger = new Hamburger("'Classic Burger'", "'regular white bread'", "'ground veal'", 4.5);
        classicBurger.setAddition1("lettuce", 0.5);
        classicBurger.setAddition2("tomato", 0.89);
       
        System.out.println("=== Welcome to Bill's Burger ===\n");
       
        System.out.println("This is " + classicBurger.getName() + ", priced " + classicBurger.getPrice() + " PLN\nin "+
                classicBurger.getBreadRollType() + ", and " + classicBurger.getMeat() +",\nwith:\n" + classicBurger.getNameOfAdditions() + "\n" +
                "Total price: " + classicBurger.getPriceWithAdditions() + " PLN, with all selected additions.");
       
        System.out.println("   ---   ---   ---");
       
        HealthyBurger healthyBurger = new HealthyBurger("'Healthy Burger'", "'Brown rye bread roll'", "'ground pork'", 5.8);
        healthyBurger.setAddition1("cheese", 1.2);
        healthyBurger.setAddition2("garlic", 0.45);
        healthyBurger.setAddition3("pickle", 0.4);
        healthyBurger.setAddition4("salad", 0.3);
        healthyBurger.setAddition5("olives", 0.75);
        healthyBurger.setAddition6("souse", 0.2);
        System.out.println("This is " + healthyBurger.getName() + ", priced " + healthyBurger.getPrice() + " PLN\nin "+
                healthyBurger.getBreadRollType() + ", and " + healthyBurger.getMeat() +",\nwith:\n" + healthyBurger.getNameOfAdditions() + "\n" +
                "Total price: " + healthyBurger.getPriceWithAdditions() + " PLN, with all selected additions.");
        
        System.out.println("   ---   ---   ---");

        DeluxeBurger deluxeBurger = new DeluxeBurger("'Deluxe Burger'", "'Extra crisp bread'", "'ground beef'", 7.5);
        System.out.println("This is " + deluxeBurger.getName() + ", priced " + deluxeBurger.getPrice() + " PLN\nin "+
                deluxeBurger.getBreadRollType() + ", and " + deluxeBurger.getMeat() +",\nwith:\n" + deluxeBurger.getNameOfAdditions() + "\n" +
                "Total price: " + deluxeBurger.getPriceWithAdditions() + " PLN, with all additions.");
    }
}


// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
// Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.
