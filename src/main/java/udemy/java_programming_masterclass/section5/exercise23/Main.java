package udemy.java_programming_masterclass.section5.exercise23;

public class Main {
    public static void main(String[] args) {

        System.out.println("== Exercise 23 ==");
        NumberToWords.numberToWords(123);
        System.out.println("- should be 'One Two Three'");
        NumberToWords.numberToWords(1010);
        System.out.println("- should be 'One Zero One Zero'");
        NumberToWords.numberToWords(1000);
        System.out.println("- should be 'One Zero Zero Zero'");
        NumberToWords.numberToWords(-12);
        System.out.println(" - should be 'Invalid Value'");
        NumberToWords.numberToWords(37683);
        System.out.println("- should be 'Three Seven Six Eight Three'");

//        System.out.println("\ngetDigitCount method number test:");
//        System.out.println(NumberToWords.getDigitCount(0) + " shoud be '1'");
//        System.out.println(NumberToWords.getDigitCount(123) + " shoud be '3'");
//        System.out.println(NumberToWords.getDigitCount(-12) + " shoud be '-1'");
//        System.out.println(NumberToWords.getDigitCount(5200) + " shoud be '4'");

//        System.out.println("\nreversed method number test:");
//        System.out.println("is -> "+ NumberToWords.reverse(-121) + " should be '-121'");
//        System.out.println("is -> "+ NumberToWords.reverse(121) + " should be '121'");
//        System.out.println("is -> "+ NumberToWords.reverse(1234) + " should be '4321'");
//        System.out.println("is -> "+ NumberToWords.reverse(100) + " should be '1'");

    }
}
