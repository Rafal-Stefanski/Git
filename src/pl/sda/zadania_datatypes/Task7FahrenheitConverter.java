package pl.sda.zadania_datatypes;

/**
 * 7. W osobnej klasie FahrenheitConverter, w metodzie main() napisz program przekształcający dane o temperaturze
 * podanej w skali Fahrenheit do skali Celsjusza. Dane wejściowe (temperatura w skali Fahrenheit) podać w inicjacji
 * odpowiedniej zmiennej w programie. Sprawdź czy program poprawnie oblicza temperatury dla danych:
 * 32 °F = 0 °C; 212 °F = 100 °C
 */

public class Task7FahrenheitConverter {
    public static void main(String[] args) {

        double f = 32; // Fahrenheit Temperature.
        double converterToC = ((f - 32) / 1.8); // Celsius temperature
        System.out.println("Temperature: " + f + " F deg. is equal to: " + converterToC + " Celsius deg.");

        f = 212; // Fahren Temperature.
        converterToC = ((f - 32) / 1.8); // Celsius temperature
        System.out.println("Temperature: " + f + " F deg. is equal to: " + converterToC + " Celsius deg.");

    }
}
