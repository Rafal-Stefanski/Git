package udemy.java_programming_masterclass.section4.exercise8;

public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * radius * radius;
    }

    public static double area(double a, double b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        return a * b;
    }
}
