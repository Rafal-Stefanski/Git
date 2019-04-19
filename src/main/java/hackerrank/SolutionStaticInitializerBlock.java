package hackerrank;

import java.util.*;

public class SolutionStaticInitializerBlock {

//    Write your code here
    private static Scanner scanner = new Scanner (System.in);
    private static int B = scanner.nextInt();
    private static int H = scanner.nextInt();
    private static boolean flag = true;

    static {
        if (B<= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

