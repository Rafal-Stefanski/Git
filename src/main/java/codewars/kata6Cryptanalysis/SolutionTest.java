package codewars.kata6Cryptanalysis;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void exampleTests() {
        String[][] tests = {
                {"hello", "0.1.2.2.3"},
                {"heLlo", "0.1.2.2.3"},
                {"helLo", "0.1.2.2.3"},
                {"Hippopotomonstrosesquippedaliophobia", "0.1.2.2.3.2.3.4.3.5.3.6.7.4.8.3.7.9.7.10.11.1.2.2.9.12.13.14.1.3.2.0.3.15.1.13"},
        };
        for(String[] arr: tests)
            assertEquals(arr[1],Crypto.wordPattern(arr[0]));
    }
}

