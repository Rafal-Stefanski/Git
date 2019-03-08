package pl.sda.zadania_oop;

/**
 * 2. Przenieś kod zapisany w metodach main() klas FahrenheitConverter i ComputerPrice do osobnych metod, np.:
 * convertToCelsius(double temperatureInFahrenheit), getComputerPrice()
 */

public class Task2FahrenheitConverter {
    public static void main(String[] args) {
        Task2FahrenheitConverter fahrenheitConverter = new Task2FahrenheitConverter();

        //Fahrenheit to Celsius.
        double f = 32; // Fahrenheit Temperature.
        double c = fahrenheitConverter.convertToC(f); // Celsius temperature
        System.out.println("Temperature: " + f + "\u00b0 F, is equal to: " + c + "\u00b0 C"); // the "\u00b0" is "°" symbol.

        f = 212; // Fahrenheit Temperature.
        c = fahrenheitConverter.convertToC(f); // Celsius temperature
        System.out.println("Temperature: " + f + "\u00b0 F, is equal to: " + c + "\u00b0 C");

        //Celsius to Fahrenheit.
        c = 0;
        f=fahrenheitConverter.convertCoF(c);
        System.out.println("Temperature: " + c + "\u00b0 C, is equal to: " + f + "\u00b0 F");

        c = 100;
        f=fahrenheitConverter.convertCoF(c);
        System.out.println("Temperature: " + c + "\u00b0 C, is equal to: " + f + "\u00b0 F");


//        int f = 212;
//        double converterFnC = ((f - 32) / 1.8);
//
//        // double converterCnF =((c * 1.8) + 32);
//
//        System.out.println("Temperature: " + f + " F deg. is equal to: " + converterFnC + " Celsius deg.");


    }
    private double convertToC (double fahrenheitTemp) {     // Celsius temperature - method
        return ((fahrenheitTemp - 32) / 1.8);
    }


    private double convertCoF (double celsiusTemp) {        // Fahrenheit temperature - method
        return ((celsiusTemp * 1.8) + 32);
    }





}

