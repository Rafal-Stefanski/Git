package udemy.java_programming_masterclass.section5.exercise22;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Exercise 22 (for loop) ==");
        System.out.println(PerfectNumber.isPerfectNumber(6) + " - should be 'true'");
        System.out.println(PerfectNumber.isPerfectNumber(28) + " - should be 'true'");
        System.out.println(PerfectNumber.isPerfectNumber(5) + " - should be 'false'");
        System.out.println(PerfectNumber.isPerfectNumber(-1) + " - should be 'false'");
        System.out.println("\n== Exercise 22 (while loop) ==");
        System.out.println(PerfectNumber.isPerfectNumberen(6) + " - should be 'true'");
        System.out.println(PerfectNumber.isPerfectNumberen(28) + " - should be 'true'");
        System.out.println(PerfectNumber.isPerfectNumberen(5) + " - should be 'false'");
        System.out.println(PerfectNumber.isPerfectNumberen(-1) + " - should be 'false'");

    }
}
