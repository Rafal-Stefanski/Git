package pl.sda.zadania_enums;

/**
 * 2. Utwórz enum Operation, dla którego występować będą wartości: PLUS, MINUS, MULTIPLY, DIVIDE.
 * <p>
 * 3.  a do Operation reprezentację tekstową: "+", "-" itp
 * <p>
 * 4. Dodaj do enum Operation metodę calculate(double a, double b), która dla dwóch podanych liczb
 * wykona odpowiednią operację matematyczną oraz wyświetli jej wywołanie w "ładny" sposób
 * na konsoli. Zadbaj o przykład użycia i wykonanie kilku operacji matematycznych.
 */

public enum Operation {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("x"),
    DIVIDE("/");

    private String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public double calculate(double a, double b) {
        double result = 0;
        switch (this) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                result = a / b;
                break;
        }
        System.out.printf("%.2f %s %.2f = %.2f%n", a, getSymbol(), b, result);
        return result;
    }
}
