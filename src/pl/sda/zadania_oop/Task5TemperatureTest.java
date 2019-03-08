package pl.sda.zadania_oop;

public class Task5TemperatureTest {

    public static void main(String[] args) {
        Task5Temperature temperature = new Task5Temperature(7,"8-02-2019","14:40");
        temperature.show();
        temperature.showInFahrenheit();
    }
}
