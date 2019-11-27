package udemy.java_programming_masterclass.section5.exercise25;

public class Main {
    public static void main(String[] args) {
        System.out.println("Should be 7 is: " + LargestPrime.getLargestPrime(21));
        System.out.println("Should be 31 is: " + LargestPrime.getLargestPrime(217));
        System.out.println("Should be -1 is: " + LargestPrime.getLargestPrime(0));
        System.out.println("Should be 5 is: " + LargestPrime.getLargestPrime(45));
        System.out.println("Should be -1 is: " + LargestPrime.getLargestPrime(-1));
    }
}
