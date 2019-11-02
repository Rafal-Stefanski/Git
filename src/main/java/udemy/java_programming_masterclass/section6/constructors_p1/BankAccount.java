package udemy.java_programming_masterclass.section6.constructors_p1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    // empty constructor - domyślny
    public BankAccount() {
        // wywołanie innego konstruktora aby wypełnić pola wartościami domyślnymi
        this("0000-0000", 0.00, "Default name", "Default email address", "Default phone number");
        System.out.println("Empty constructor called");
    }

    // constructor (zestaw seterów dla wybranych pól)
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void addToBalance(double deposit) {
        this.balance += deposit;
        System.out.println("Deposit of " + deposit + " made. New balance is " + this.balance);
    }

    public void withdrawFundsFromBalance(double withdraw) {
        if ((this.balance - withdraw) < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdraw;
            System.out.println("Withdraw amount " + withdraw + " processed. Remaining balance = " + this.balance);
        }
    }


}
