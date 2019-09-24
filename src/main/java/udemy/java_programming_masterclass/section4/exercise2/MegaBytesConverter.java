package udemy.java_programming_masterclass.section4.exercise2;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        int megaBytes = kiloBytes / 1000;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB" + " and " + kiloBytes + " KB");
    }
}
