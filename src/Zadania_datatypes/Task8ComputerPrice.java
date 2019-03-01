package Zadania_datatypes;

/**
 * 8.  W osobnej klasie ComputerPrice, w metodzie main() napisz program obliczający cenę komputera na podstawie jego
 * części. Program ma wypisać na konsolę osobno cenę samego komputera: płyta główna, procesor, pamięć RAM,
 * dysk twardy i osobno cenę komputera i monitora. W cenie należy uwzględnić podatek VAT = 23%.
 */

public class Task8ComputerPrice {
    public static void main(String[] args) {

        int mainBoardPrice = 500;
        int processorPrice = 1200;
        int ramMemoryPrice = 400;
        int hardDiskPrice = 600;
        int monitorPrice = 950;

        int computerPrice = mainBoardPrice + processorPrice + ramMemoryPrice + hardDiskPrice;
        int setPrice = computerPrice + monitorPrice;

        System.out.println("Computer price: " + computerPrice + " PLN net price");
        System.out.println("Computer price: " + computerPrice * 1.23 + " PLN incl. 23% VAT");
        System.out.println("Monitor Price: " + monitorPrice + " PLN net price");
        System.out.println("Monitor Price: " + monitorPrice * 1.23 + " PLN incl. 23% VAT");
        System.out.println("Computer set Price is: " + setPrice * 1.23 + " PLN incl. 23% VAT");


    }
}
