package pl.sda.zadania_concurrent;

public class CustomRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
