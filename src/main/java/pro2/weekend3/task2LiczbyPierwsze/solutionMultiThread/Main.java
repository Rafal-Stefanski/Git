package pro2.weekend3.task2LiczbyPierwsze.solutionMultiThread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        //sprawdzLiczbyPierwszeJednowatkowo();
        sprawdzLiczbyPierwszeWielowatkowo();
        long endTime = System.currentTimeMillis();
        System.out.println("Zajeło to " + (endTime-startTime) + " ms");
    }

    private static void sprawdzLiczbyPierwszeWielowatkowo() throws FileNotFoundException {
        ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        File file = new File("src/main/resources/numbers.txt");
        Scanner scanner = new Scanner(file);
        final AtomicInteger ileLiczbPierwszych = new AtomicInteger(0);
        while (scanner.hasNextLong()) {
            final long number = scanner.nextLong();

            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    if (isPrime(number)) {
                        ileLiczbPierwszych.incrementAndGet();
                        System.out.println("Liczba pierwsza: " + number + ". " +
                                "Łącznie znalazłem liczb pierwszych: " + ileLiczbPierwszych.get());
                    }
                }
            });
        }

        try {
            threadPool.shutdown();
            threadPool.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void sprawdzLiczbyPierwszeJednowatkowo() throws FileNotFoundException {
        File file = new File("src/main/resources/numbers.txt");
        Scanner scanner = new Scanner(file);
        int ileLiczbPierwszych = 0;
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();

            if (isPrime(number)) {
                ileLiczbPierwszych++;
                System.out.println("Liczba pierwsza: " + number + ". Łącznie znalazłem liczb pierwszych: " + ileLiczbPierwszych);
            }
        }
    }

    private static boolean isPrime(long number) {
        if (number <= 1)
            return false;
        for (long i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

}

