package udemy.java_programming_masterclass.section6.constructors_p1;

public class Main {
    public static void main(String[] args) {

        // Przykład tworzenia obiektu konta bankowego korzystając z seterów w klasie BankAccount i konstructora domyślnego (pustego)
        BankAccount bankAccount001 = new BankAccount();
        bankAccount001.setAccountNumber("1234-1234-1234-1234");
        bankAccount001.setBalance(0.00);
        bankAccount001.setCustomerName("Bob Brown");
        bankAccount001.setCustomerEmail("BobBrown@email.com");
        bankAccount001.setCustomerPhoneNumber("123-456-789");

        // zamiast tego możemy użyć konstruktora dla wszystkich pól aby uprościć zapis.
        BankAccount bankAccount002 = new BankAccount("1234-1234-5678-5678", 0.00, "Billy Black", "billyblack@email.com", "456-654-456");

        System.out.println("");
        System.out.println(bankAccount001.getAccountNumber());
        System.out.println(bankAccount002.getAccountNumber());

        System.out.println("");
        bankAccount001.withdrawFundsFromBalance(100.0);

        bankAccount001.addToBalance(50.0);
        bankAccount001.withdrawFundsFromBalance(100.0);

        bankAccount001.addToBalance(51.0);
        bankAccount001.withdrawFundsFromBalance(100.0);

    }
}
