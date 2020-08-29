package codewars.kata5School;

public class School {
    public static int getAverage(int[] marks) {

        int total = 0;

        for (int i : marks) {
            total += i;
        }

//        Alternative to:
//        for (int i = 0; i < marks.length; i++) {
//            total += marks[i];
//        }

        return total/marks.length;
    }
}
