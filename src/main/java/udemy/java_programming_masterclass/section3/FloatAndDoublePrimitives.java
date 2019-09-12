package udemy.java_programming_masterclass.section3;

public class FloatAndDoublePrimitives {
    public static void main(String[] args) {

        // Float precision number
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("\nFloat minimum value: " + myMinFloatValue);
        System.out.println("Float maximum value: " + myMaxFloatValue);


        // Double precision number
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("\nDouble minimum value: " + myMinDoubleValue);
        System.out.println("Double maximum value: " + myMaxDoubleValue);

        // Sposoby zapisu
        int myIntValue = 5 / 3;
        float myFLoatValue = 5f / 3f;
        float myCastFLoatValue = (float) 5.25; // sposób zapisu z cast'em, niepolecany
        double myDoubleValue = 5.00 / 3.00;
        double mSecondDoubleValue = 5.25; // bez dodatku d też działa

        System.out.println("\nMyIntValue = " + myIntValue);
        System.out.println("myFLoatValue = " + myFLoatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Challenge - pounds to kilograms converter
        double poundsValue = 70.0;
        double kilogramValue = poundsValue * 0.453559237;
        System.out.println("\nCHALLENGE -> " + poundsValue + " pounds to kilograms value is: " + kilogramValue);

        // pi
        double pi = 3.1415927d;
        System.out.println("\nPi number = " + pi);
        double anotherDoubleNumber = 3_000_000.4_567_890d;
        System.out.println("\nanother Double Number = " + anotherDoubleNumber);

    }
}
