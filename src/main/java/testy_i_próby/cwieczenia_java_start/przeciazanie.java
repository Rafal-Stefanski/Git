package testy_i_próby.cwieczenia_java_start;

/**
 * przeciazanie metody
 * https://www.youtube.com/watch?time_continue=83&v=3-X52xOJqww
 */

public class przeciazanie {
    public static void main(String[] args) {
        displayName();
        displayName("Dorota");

        System.out.println("dodawanie intow " + add(2, 3));
        System.out.println("dodawanie doubli " + add(5.33, 4.66));
    }

    private static void displayName() {
        System.out.println("Monika");
    }

    private static void displayName(String name) {
        System.out.println(name);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}
