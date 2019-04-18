package hackerrank;

import java.util.Scanner;

public class SolutionLoopsII {
    public static void main(String[] argh) {
        Scanner scannerek = new Scanner(System.in);
        int t = scannerek.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scannerek.nextInt();
            int b = scannerek.nextInt();
            int n = scannerek.nextInt();
            for (int j = 0; j < n; j++) {
                a = a + ((int) Math.pow(2, j) * b);
                System.out.println(a + "");
            }
            System.out.println( );
        }
        scannerek.close();
    }
}
