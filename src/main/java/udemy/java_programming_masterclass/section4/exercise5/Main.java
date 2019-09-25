package udemy.java_programming_masterclass.section4.exercise5;

public class Main {
    public static void main(String[] args) {
        boolean areEqual = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(areEqual);   // should be true
        areEqual = DecimalComparator.areEqualByThreeDecimalPlaces(-3.175, -3.176);
        System.out.println(areEqual);   // should be false
    }
}
