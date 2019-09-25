package udemy.java_programming_masterclass.section4.exercise2;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int kiloBytesRemain = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB" + " and " + kiloBytesRemain + " KB");
        }
    }
}
