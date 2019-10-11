package udemy.java_programming_masterclass.section5.exercise24;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (smallCount >= goal % 5) {
            if (bigCount * 5 + smallCount >= goal) {
                return true;
            }
        }
        return false;
    }
}
