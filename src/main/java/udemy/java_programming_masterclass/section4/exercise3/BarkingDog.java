package udemy.java_programming_masterclass.section4.exercise3;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && hourOfDay >= 0 && hourOfDay <= 23) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
