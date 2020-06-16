package udemy.java_programming_masterclass.section11.access_modifiers;

public class Main {
    public static void main(String[] args) {
        Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-20);
        timsAccount.calculateBalance();
        timsAccount.balance = 5000;

        System.out.println("Balance in account is " + timsAccount.getBalance());
        timsAccount.transactions.add(4500);
        timsAccount.calculateBalance();
    }
}
