package udemy_programming_masterclass;

public class IntMaxMin {
    public static void main(String[] args) {
        //Wyswietlnie maxymalnej wartosci int'a
        int myIntMaxValue = Integer.MAX_VALUE;
        int myIntMinValue = Integer.MIN_VALUE;
        System.out.println("int max value: " + myIntMaxValue);
        System.out.println("int min value: " + myIntMinValue);

        //rozne sposoby zapisu.
        int myTestInt = 2147483647;
        System.out.println(myTestInt);
        int my_Test_Int = 2_147_483_647;
        System.out.println(my_Test_Int);
    }
}
