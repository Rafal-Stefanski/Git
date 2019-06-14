package pl.sda.zadania_arrays;

public class Varargs_Testing {
    public static void main(String[] args) {
        Varargs_Testing varargs_testowe = new Varargs_Testing();

        int[] ints = {3, 8, 4};
        varargs_testowe.showNumbers(ints);
    }

    private void showNumbers(int... numbers) {
        System.out.println("Show numbers: ");
        if (numbers.length > 0) {
            System.out.println(numbers[0]);
        }
        for (int number : numbers
             ) {
            System.out.print(number + "; ");

        }
    }
}
