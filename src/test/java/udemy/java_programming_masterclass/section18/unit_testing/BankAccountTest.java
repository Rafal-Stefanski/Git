package udemy.java_programming_masterclass.section18.unit_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void deposit() {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    void withdraw() {
        fail("This test has yet to be implemented");
    }

    @Test
    void getBalance() {
        fail("This test has yet to be implemented");
    }


}