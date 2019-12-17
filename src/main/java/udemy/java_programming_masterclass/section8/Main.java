package udemy.java_programming_masterclass.section8;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10]; // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        myIntArray[0] = 45;
//        myIntArray[1] = 475;
//        myIntArray[5] = 50;
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }


//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);

    }
}
