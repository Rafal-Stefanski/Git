package pl.sda.zadania_enums;

/**
 * 1. Utwórz enum Currency, który ma reprezentować walutę. Ograniczmy się do 5 walut: polski złoty, dolar, euro,
 * jen, funt brytyjski.
 *
 * 3. Do enum Currency dodaj pole oznaczające symbol waluty: "PLN", "USD" itp.
 */

//public enum Currency {
//    PLN("PLN",1), USD("USD", 3.79), EUR("EUR", 4.33), JPY("JPN", 0.034), GBP("GPB", 4.86);
//
//    private String symbol;
//    private String exchangeRate;
//
//    Currency(String symbol, String exchangeRate) {
//        this.symbol = symbol;
//        this.exchangeRate = exchangeRate;
//    }
//
//    public String getSymbol() {
//        return symbol;
//    }
//
//    public String getExchangeRate() {
//        return exchangeRate;
//    }
//
//    //PLN -> EUR/GBP itp
//    public double exchangeToPln(double value) {
//        return (1 / getExchangeRate()) * value;
//    }
//
//    //EUR/GPB itp -> PLN
//    public double exchangeToPln(double value) {
//        return getExchangeRate() * value;
//    }
//
//
//}
