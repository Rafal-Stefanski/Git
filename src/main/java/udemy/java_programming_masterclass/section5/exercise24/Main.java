package udemy.java_programming_masterclass.section5.exercise24;

public class Main {
    public static void main(String[] args) {
        System.out.println("1,0,4   is '" + FlourPacker.canPack(1,0,4) + "' should be 'false'");
        System.out.println("1,0,5   is '" + FlourPacker.canPack(1,0,5) + "' should be 'true'");
        System.out.println("0,5,4   is '" + FlourPacker.canPack(0,5,4) + "' should be 'true'");
        System.out.println("2,2,11  is '" + FlourPacker.canPack(2,2,11) + "' should be 'true'");
        System.out.println("-3,2,11 is '" + FlourPacker.canPack(-3,2,12) + "' should be 'false'");
        System.out.println("1,0,6   is '" + FlourPacker.canPack(1,0,6) + "' should be 'false'");


    }
}
