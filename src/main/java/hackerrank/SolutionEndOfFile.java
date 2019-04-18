package hackerrank;

import java.util.Scanner;

public class SolutionEndOfFile {
    public static void main(String[] args) {
        Scanner myStr = new Scanner(System.in);
        int i = 0;
//      while loop
        while (myStr.hasNext()) {
            i++;
            System.out.println(i + " " + myStr.nextLine());
        }

//        for loop
        Scanner forScanner = new Scanner(System.in);
        for (int j = 1; forScanner.hasNext() == true; j++) {
            System.out.println(j + " " + forScanner.nextLine());
        }
    }

}


