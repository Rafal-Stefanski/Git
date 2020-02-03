package udemy.java_programming_masterclass.section8.challenge_autoboxing_unboxing.solution;

/*
    Niestety kod nie działa. Do przejrzenia.
 */

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Perry", 220.12);

        bank.addBranch("Sydney");

        bank.addCustomerTransaction("Adelaide", "Tim", 50.05);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Perry", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }
    }
}


// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions
