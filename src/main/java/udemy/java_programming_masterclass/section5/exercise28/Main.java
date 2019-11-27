package udemy.java_programming_masterclass.section5.exercise28;

public class Main {
    public static void main(String[] args) {
        System.out.println("==>> Method 1 - 4 param");
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2) + " should be '-1'");
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2) + " should be '3'");
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1) + " should be '3'");

        System.out.println("\n==>> Method 2 - 3 param");
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5) + " should be '-1'");
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5) + " should be '5'");
        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35) + " should be '14'");

        System.out.println("\n==>> Method 4 - 2 param");
        System.out.println(PaintJob.getBucketCount(3.4, 1.5) + " should be '3'");
        System.out.println(PaintJob.getBucketCount(6.25,2.2) + " should be '3'");
        System.out.println(PaintJob.getBucketCount(3.26,0.75) + " should be '5'");
    }
}
