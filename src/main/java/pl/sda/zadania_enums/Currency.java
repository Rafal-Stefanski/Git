package pl.sda.zadania_enums;

/**
 * 1. Utwórz enum Currency, który ma reprezentować walutę. Ograniczmy się do 5 walut: polski złoty,
 * dolar, euro, jen, funt brytyjski.
 *
 * 3. Do enum Currency dodaj pole oznaczające symbol waluty: "PLN", "USD" itp.
 */

public enum Currency {
    PLN("PLN", 1),
    USD("USD", 3.8),
    EUR("EUR", 4.4),
    JEN("JPN", 0.034),
    GPB("GBP", 5.0);

    private String symbol;
    private double exchangeRate;

    Currency(String symbol, double exchangeRate) {
        this.symbol = symbol;
        this.exchangeRate = exchangeRate;
    }
}
