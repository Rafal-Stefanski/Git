package pl.sda.zadania_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {   //sprawdzamy jest to to miejsce gdzie moze powstać wyjątek
        int index = scanner.nextInt();
        String[] fruits = new String[]{"apple", "organe", "mango", "cheery"};
        System.out.println(fruits[index]);
        }
        catch (InputMismatchException ime){
            System.out.println("Letter not number " + ime);
        } catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Too big number for table " + aioobe);
        } finally {
            System.out.println("That's all folks!");
        }
    }
}
