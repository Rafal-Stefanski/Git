package udemy.java_programming_masterclass.section4;

public class MethodOverloadingSecondChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value.";

    public static void main(String[] args) {

        getDurationString(456L, 57L);
        getDurationString(61L, 0);
        getDurationString(8345L);


    }


    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("Invalid value");
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remaingMinutes = minutes % 60;
        String hourString = hours + "h";
        if (hours < 10) {
            hourString = "0" + hourString;
        }
        String minuteString = remaingMinutes + "m";
        if (remaingMinutes < 10) {
            minuteString = "0" + minuteString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        String hoursMinutesSecodns = minutes + " minutes " + seconds + " seconds, is: " + hourString + " " + minuteString + " " + secondsString;
        System.out.println(hoursMinutesSecodns);
        return hoursMinutesSecodns;
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            System.out.println("invalid value");
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remaingSeconds = seconds % 60;
        System.out.println("\n" + seconds + " seconds is:");
        return getDurationString(minutes, remaingSeconds);
    }

}
