package hackerrank;

import java.util.Scanner;

public class SolutionSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        //----------------------

        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        for (int i = 0; i <= s.length() - k; i++) {
            String curs = s.substring(i, i + k);
            if (smallest.compareTo(curs) > 0) {
                smallest = curs;
            }
            if (largest.compareTo(curs) < 0) {
                largest = curs;
            }
        }

        //----------------------


        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
