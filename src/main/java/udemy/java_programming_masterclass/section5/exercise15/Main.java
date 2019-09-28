package udemy.java_programming_masterclass.section5.exercise15;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 15 - SumOddRange");
        System.out.println(SumOddRange.sumOdd(1,100));
        System.out.println(SumOddRange.sumOdd(-1,100));
        System.out.println(SumOddRange.sumOdd(100,100));
        System.out.println(SumOddRange.sumOdd(13,13));
        System.out.println(SumOddRange.sumOdd(100,-100));
        System.out.println(SumOddRange.sumOdd(100,1000));
    }
}
