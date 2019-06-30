package pro2.weekend3.task2LiczbyPierwsze;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class LiczbyPierwsze {
    public static void main(String[] args) throws FileNotFoundException {
        int quantityPrimeNumbers = 0;

        File file = new File("src\\main\\resources\\numbers.txt");
        Scanner readFile = new Scanner(file);

        long startTime = System.currentTimeMillis();


        while (readFile.hasNextLong()) {

//            ExecutorService threadPool = Executors.newFixedThreadPool(2);
//            final AtomicInteger isPrime = new AtomicInteger(0);

            long number = readFile.nextLong();

            if (isPrime(number)) {
                quantityPrimeNumbers++;
                System.out.println("Liczba pierwsza: " + number + ", łącznie liczb pierwszych: " + quantityPrimeNumbers);
            }

        }
        long endTime = System.currentTimeMillis();
        System.out.println("Zajeło to " + (endTime-startTime) + " ms");
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
