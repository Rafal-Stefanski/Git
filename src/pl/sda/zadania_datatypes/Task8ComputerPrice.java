package pl.sda.zadania_datatypes;

/**
 * 8.  W osobnej klasie ComputerPrice, w metodzie main() napisz program obliczający cenę komputera na podstawie jego
 * części. Program ma wypisać na konsolę osobno cenę samego komputera: płyta główna, procesor, pamięć RAM,
 * dysk twardy i osobno cenę komputera i monitora. W cenie należy uwzględnić podatek VAT = 23%.
 */

public class Task8ComputerPrice {
    public static void main(String[] args) {

        double mainBoardPrice = 500;
        double processorPrice = 1200;
        double ramMemoryPrice = 400;
        double hardDiskPrice = 600;
        double monitorPrice = 950;

        double VAT = 1.23;

        double computerPrice = mainBoardPrice + processorPrice + ramMemoryPrice + hardDiskPrice;
        System.out.println("Computer price: " + computerPrice + " PLN net price");
        System.out.println("Computer price: " + computerPrice * VAT + " PLN incl. 23% VAT");

        double setPrice = computerPrice + monitorPrice;
        System.out.println("Monitor Price: " + monitorPrice + " PLN net price");
        System.out.println("Monitor Price: " + monitorPrice * VAT + " PLN incl. 23% VAT");
        System.out.println("Computer set Price is: " + setPrice * VAT + " PLN incl. 23% VAT");


    }
}
