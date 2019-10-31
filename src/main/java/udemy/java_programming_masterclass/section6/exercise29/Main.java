package udemy.java_programming_masterclass.section6.exercise29;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("add = " + calculator.getAdditionResult());
    }
}
