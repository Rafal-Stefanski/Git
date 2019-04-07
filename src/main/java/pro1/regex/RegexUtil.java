package pro1.regex;

public class RegexUtil {
    public static boolean isValidPostalCode(String text) {
        String reg = "\\d{2}-\\d{3}";
        if (text.matches(reg)){
            return true;
        }
        return false;
    }

    public static boolean isValidHttpAddress(String text) {
        String reg = "([0-1]?)[0-9]\\\\.([0-3]?)[0-9]\\\\.([0-9]{4})";
//        String reg = "\\d{2}.\\d{2}.\\d{4}";
        if (text.matches(reg)){
            return true;
        }
        return false;
    }

    public static boolean isVaildDateFormat(String text) {
        String reg = "";
        if (text.matches(reg)) {
            return true;
        }
        return false;
    }
}
