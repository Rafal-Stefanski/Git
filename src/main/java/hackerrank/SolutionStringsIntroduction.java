package hackerrank;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;

public class SolutionStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());

        int diff = A.toUpperCase().charAt(0) - B.toUpperCase().charAt(0);
        if (diff>0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Przy użyciu StringUtils
//        System.out.println(StringUtils.capitalize(A) + " " + StringUtils.capitalize(B));

        // Przy użyciu toUpper i wywołaniu substring w dwóch częściach.
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1) + " " + B.substring(0,1).toUpperCase()+B.substring(1));

    }
}
