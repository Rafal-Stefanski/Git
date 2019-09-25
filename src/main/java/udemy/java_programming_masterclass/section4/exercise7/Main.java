package udemy.java_programming_masterclass.section4.exercise7;

public class Main {
    public static void main(String[] args) {
        boolean hasTeens = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println(hasTeens);
        hasTeens = TeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println(hasTeens);
        hasTeens = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println(hasTeens);
        boolean isTeen = TeenNumberChecker.isTeen(9);
        System.out.println(isTeen);
        isTeen = TeenNumberChecker.isTeen(13);
        System.out.println(isTeen);

    }
}
