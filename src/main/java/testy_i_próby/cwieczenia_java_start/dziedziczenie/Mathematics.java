package testy_i_próby.cwieczenia_java_start.dziedziczenie;

/**
 * Dziedziczenie i przeciążanie metod.
 * https://www.youtube.com/watch?v=bPHr64sReSs
 */

public class Mathematics {
    public static void main(String[] args) {
        Mathematics math = new Mathematics();
        math.className();
        System.out.println("a^2 = " + math.sqrt(2));
        System.out.println("a^2 = " + math.sqrt(2.4));
        System.out.println("a^2 = " + math.sqrt(5));
        System.out.println("a^2 = " + math.sqrt(5.2));
    }

    private void className() {
        System.out.println("Mathematics");
    }

    private int sqrt(int a) {
        return a * a;
    }
    private double sqrt(double a) {
        return a * a;
    }

}

