package pl.sda.zadania_oop;

/**
 * 5. * Utwórz nową klasę Temperature, która będzie posiadała pola: double temperature, String date, String hour.
 * Klasa określa temperaturę w skali Celsjusza w konkretnym dniu i o konkretnej godzinie. Dodaj konstruktor
 * inicjalizujący wszystkie trzy pola, metody-gettery dla każdego pola + dodaj metodę show() która będzie zwracała
 * napis w postaci: {date} {hour} - {temperature} °C, np: 2018-10-01 10:45 - 13 °C
 */

public class Task5Temperature {
    private double temperature;
    private String date;
    private String hour;
    private Task2FahrenheitConverter fahrenheitConverter = new Task2FahrenheitConverter();

    public Task5Temperature(double temperature, String date, String hour) {
        this.temperature = temperature;
        this.date = date;
        this.hour = hour;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    public void show () {
        System.out.println(date + " " + hour + " " + temperature + " st. C");
    }
    public void showInFahrenheit() {
        double convertCoF = fahrenheitConverter.convertCoF(temperature);
        System.out.println(date + " " + hour + " " + convertCoF + " st. F");
    }
}
