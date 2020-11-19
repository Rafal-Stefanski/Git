package udemy.java_programming_masterclass.section15.threads;

import static udemy.java_programming_masterclass.section15.threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable implementation of run().");
    }
}
