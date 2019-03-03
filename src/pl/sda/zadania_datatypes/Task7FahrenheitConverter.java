package pl.sda.zadania_datatypes;

/**
 * 7. W osobnej klasie FahrenheitConverter, w metodzie main() napisz program przekształcający dane o temperaturze
 * podanej w skali Fahrenheit do skali Celsjusza. Dane wejściowe (temperatura w skali Fahrenheit) podać w inicjacji
 * odpowiedniej zmiennej w programie. Sprawdź czy program poprawnie oblicza temperatury dla danych:
 * 32 °F = 0 °C; 212 °F = 100 °C
 */

public class Task7FahrenheitConverter {
    public static void main(String[] args) {

        int f = 212;
        double converterFnC = ((f - 30) / 1.8);

        // double converterCnF =((c * 1.8) + 30);

        System.out.println("Temperature: " + f + " F deg. is equal to: " + converterFnC + " Celsius deg.");

    }
}
