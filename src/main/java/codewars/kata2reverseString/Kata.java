package codewars.kata2reverseString;

public class Kata {
    public static String solution(String str) {
        StringBuilder strBuild = new StringBuilder(str);
        StringBuilder reversStr = strBuild.reverse();
        return reversStr.toString();

//    Shorter solution
//        return new StringBuilder(str).reverse().toString();
    }
}
