package pl.sda.zadania_enums;

/**
 * 1. Utwórz enum Currency, który ma reprezentować walutę. Ograniczmy się do 5 walut: polski złoty,
 * dolar, euro, jen, funt brytyjski.
 * <p>
 * 3. Do enum Currency dodaj pole oznaczające symbol waluty: "PLN", "USD" itp.
 * <p>
 * 5. Do enum Currency dodaj pole oznaczające kurs waluty (w stosunku do polskiego złotego)
 * oraz metodę która wyliczy wartość podanej kwoty w obcej walucie (np.: 100 PLN ~ 23 EUR)
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

    public String getSymbol() {
        return symbol;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    //Exchange rate PLN -> EUR/USD itd
    public double ExchangeFromPLN(double value) {
        return (1/getExchangeRate())*value;
    }

    //Exchange rate EUR/USD itd -> PLN
    public double ExchangeToPLN(double value) {
        return getExchangeRate()*value;
    }
}
