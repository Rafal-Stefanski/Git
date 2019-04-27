package hackerrank;

import java.util.Scanner;

public class SolutionStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        String reversedString = "";
        for (int i = (A.length() - 1); i >= 0; i--) {
            reversedString = reversedString + A.charAt(i);
        }
        if (A.equals(reversedString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
