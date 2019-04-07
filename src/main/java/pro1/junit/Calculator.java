package pro1.junit;

import org.junit.Test;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    @Test
    public void shouldAplusBequals(){}
}
