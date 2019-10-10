package udemy.java_programming_masterclass.section5.exercise24;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        while (bigCount * 5 + smallCount <= goal) {
            if (bigCount * 5 <= goal) {
                return true;
            }
            return false;
        }

        return true;
    }
}
