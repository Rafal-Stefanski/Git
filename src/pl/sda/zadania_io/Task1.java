package pl.sda.zadania_io;

/*
 * 3. Napisz kod, który zapisze do pliku Twoje imię i nazwisko.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1 {
    public static void main(String[] args) {


        //tworzenie Path do konkretnego katalogu
        Path baseFolder = Paths.get("C:\\JavaTestFolder");
        System.out.println("baseFolder = " + baseFolder);

        Path path = baseFolder.resolve("test_io.txt");
        try {
            //sprawdzanie i tworzenie pliku na dysku
            if(!Files.exists(path)) {
                Files.createFile(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //zapisujemy tekst do pliku
        try(FileWriter fileWriter = new FileWriter(path.toString())) {
            fileWriter.write("Rafał Stefański\n");
            fileWriter.write("Program wypisał\n");
            fileWriter.write("Bo Rafał umie w JAVE :)");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
