package udemy.java_programming_masterclass.section7.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2200", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }
}
