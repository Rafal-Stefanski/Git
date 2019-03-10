package pl.sda.zadania_coinpo.Task2;

/**
 * 2. Utwórz klasę Tool, która będzie reprezentować narzędzia do kupienia w sklepie. Każde narzędzie powinno mieć
 * swój model i cenę. Dodatkowo utwórz klasy: Hammer i Saw, które będą dziedziczyć po klasie Tool. Klasa
 * Hammer powinna mieć dodatkowe pole z wagą młotka, a klas Saw z długością piły. Utwórz klasę ToolsShop w
 * której utwórz kilka narzędzi i wyświetl ich ceny.
 */

public class Tool {
    private String model;
    private double price;

    public Tool(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
