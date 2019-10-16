package udemy.java_programming_masterclass.section5.exercise25;

public class Main {
    public static void main(String[] args) {
        System.out.println("Should be 7 is: " + LargestPrime.getLargerstPrime(21));
        System.out.println("Should be 31 is: " + LargestPrime.getLargerstPrime(217));
        System.out.println("Should be -1 is: " + LargestPrime.getLargerstPrime(0));
        System.out.println("Should be 5 is: " + LargestPrime.getLargerstPrime(45));
        System.out.println("Should be -1 is: " + LargestPrime.getLargerstPrime(-1));
    }
}
