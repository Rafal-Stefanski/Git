package testy_i_próby.loops_excercises;

public class loops_1 {
    public static void main(String[] args) {
        printStars();
    }

    static void printStars() {
        int i;
        int j;
        for (i = 0; i <= 6; i++) {
            for (j = 0; j <= 7 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
