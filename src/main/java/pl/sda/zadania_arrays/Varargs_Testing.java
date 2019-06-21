package pl.sda.zadania_arrays;

public class Varargs_Testing {
    public static void main(String[] args) {
        Varargs_Testing varargs_testowe = new Varargs_Testing();

        // przykład 1
        System.out.println("przykład 1 - tablica z int'ami");
        int[] ints = {3, 8, 4};
        varargs_testowe.showNumbers(ints);

        // przykład 2 bez dodwania bez varagsa
        System.out.println("przykład 2 - dodawanie bez varargsa");
        int result2 = add2(1, 2, 3);
        System.out.println("wynik dodawania: " + result2);

        // przykład 3 zmiania dodawanie z varargsem
        System.out.println("przykład 3 - dodawanie z varargsem");
        int result3 = add3(1, 2, 3, 9, 5, 6, 8);
        System.out.println("wynik dodawania: " + result3);

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


    private static int add2(int a, int b, int c) {
        return a + b + c;
    }

    private static int add3(int... numbers) {
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            System.out.println("element " + (i + 1) + " to " + value);
            suma += i;
        }


//        for (int i : numbers3) {
//            System.out.println("element " + (i + 1) + " to " + i);
//            suma = suma + i;
//        }
        return  suma;
    }

}
