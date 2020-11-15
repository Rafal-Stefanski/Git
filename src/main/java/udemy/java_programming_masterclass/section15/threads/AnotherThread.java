package udemy.java_programming_masterclass.section15.threads;

import static udemy.java_programming_masterclass.section15.threads.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from another tread.");
    }
}
