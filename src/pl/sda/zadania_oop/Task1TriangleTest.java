package pl.sda.zadania_oop;

/*
1. ciąg dalszy.
 */

public class Task1TriangleTest {
    public static void main(String[] args) {
        Task1Triangle triangle =new Task1Triangle();
        boolean isRectangular = triangle.isRectangular(3,4,5);

        System.out.println(isRectangular);

        triangle.print(4);
    }
}
