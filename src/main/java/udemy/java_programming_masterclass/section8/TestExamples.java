package udemy.java_programming_masterclass.section8;

public class TestExamples {
    public static void main(String[] args) {
        int[] myIntArray = new int[25]; // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        myIntArray[0] = 45;
//        myIntArray[1] = 475;
//        myIntArray[5] = 50;
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }

        printArray(myIntArray);

//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);

        System.out.println("\nSome my practice");
        int[] someArray = new int[4];
        someArray[2] = 50;
        someArray[0] = 1;
        System.out.println(someArray[2]);
        double[] someDoubleArray = new double[5];

        for (int i = 0; i < someDoubleArray.length; i++) {
            someDoubleArray[i] = (i + 1) * Math.PI;
        }

        for (int i = 0; i < someDoubleArray.length; i++) {
            System.out.println(i + " " +  someDoubleArray[i]);
        }

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
