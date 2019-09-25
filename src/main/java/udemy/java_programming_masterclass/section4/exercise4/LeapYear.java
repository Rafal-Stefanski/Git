package udemy.java_programming_masterclass.section4.exercise4;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {            // range
            if (year % 4 == 0) {                    // step 1
                if (year % 100 == 0) {              // step 2
                    if (year % 400 == 0) {          // step 3
                        return true;
                    } else {
                        return false;               // step 5
                    }
                } else {
                    return true;                    // step 4
                }
            } else {
                return false;                       // step 5
            }
        } else {
            return false;                           // step 5
        }
    }
}
