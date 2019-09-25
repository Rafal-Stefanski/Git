package udemy.java_programming_masterclass.section4.exercise6;

public class Main {
    public static void main(String[] args) {
        boolean isSumEqualNo3 = EqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println(isSumEqualNo3);
        isSumEqualNo3 = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println(isSumEqualNo3);
        isSumEqualNo3 = EqualSumChecker.hasEqualSum(1, 1, 0);
        System.out.println(isSumEqualNo3);

    }
}
