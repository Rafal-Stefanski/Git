package udemy.java_programming_masterclass.section15.challenge5;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345-678", 1000.00);

//        Thread trThread1 = new Thread() {
//            @Override
//            public void run() {
//                account.deposit(300.00);
//                account.withdraw(50.00);
//            }
//        };
//
//        Thread trThread2 = new Thread() {
//            @Override
//            public void run() {
//                account.deposit(203.75);
//                account.withdraw(100.00);
//            }
//        };
//        trThread1.start();
//        trThread2.start();

        Thread trThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(100.00);
            }
        });

        Thread trThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.00);
            }
        });

        trThread1.start();
        trThread2.start();
    }
}
