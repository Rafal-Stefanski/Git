package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionStaticInitializerBlock {

//    Write your code here
    static Scanner scanner = new Scanner (System.in);
    static boolean flag = true;
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();


    static {
        if (B<= 0 || H <= 0) {
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

