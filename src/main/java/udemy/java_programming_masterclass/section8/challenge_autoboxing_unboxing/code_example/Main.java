package udemy.java_programming_masterclass.section8.challenge_autoboxing_unboxing.code_example;

public class Main {
    public static void main(String[] args) {

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




/*
* import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("Diamond");

    public static void main(String[] args) {
        System.out.println("Welcome to Diamond Bank. Kindly go through the menu.");
        printBankMenu();
        boolean quit = false;

        while (!quit) {
            System.out.println("Please choose your option : (Enter 0 to see menu again)");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 :
                    printBankMenu();
                    break;

                case 1:
                    printBankCustomers();
                    break;

                case 2:
                    printBankCustomerTransactions();
                    break;

                case 3:
                    bank.printBranches();
                    break;

                case 4:
                    addNewBankBranch();
                    break;

                case 5:
                    addNewBankCustomer();
                    break;

                case 6:
                    addBankCustomerTransaction();
                    break;

                case 7:
                    quit = true;
                    System.out.println("Process ended");
                    break;
            }

        }
    }

    private static void printBankMenu() {
        System.out.println("\nAvailable actions: \nPress");
        System.out.println("0 -- To print menu\n" +
                "1 -- To print list of customers\n" +
                "2 -- To print list of customer's transactions\n" +
                "3 -- To print list of branches\n" +
                "4 -- To add new branch\n" +
                "5 -- To add new customer\n" +
                "6 -- To add customer's transaction\n" +
                "7 -- Quit process.");
    }

    private static void printBankCustomers() {
        System.out.print("Enter branch name");
        bank.printBranchCustomers(scanner.nextLine());
    }

    private static void printBankCustomerTransactions() {
        System.out.print("Enter branch name : ");
        String branchName = scanner.nextLine();
        System.out.print("Enter customer's name");
        String customerName = scanner.nextLine();
        bank.printBranchCustomerTransactions(branchName, customerName);
    }

    private static void addNewBankBranch() {
        System.out.print("Enter new branch name : ");
        Branch branch = Branch.createBranch(scanner.nextLine());
        bank.addNewBranch(branch);
    }

    private static void addNewBankCustomer() {
        System.out.print("Enter branch to add customer : ");
        String branchName = scanner.nextLine();
        System.out.print("Enter new customer name : ");
        String newCustomerName = scanner.nextLine();
        System.out.println("Enter initial transaction amount : ");
        double initialTransaction = scanner.nextDouble();
        scanner.nextLine();
        Customer customer = Customer.createCustomer(newCustomerName, initialTransaction);
        bank.addNewBranchCustomer(branchName, customer);
    }

    private static void addBankCustomerTransaction() {
        System.out.print("Enter transaction branch name : ");
        String branchName = scanner.nextLine();
        System.out.println("Enter customer's name : ");
        String customerName = scanner.nextLine();
        System.out.println("Enter transaction amount : ");
        double transaction = scanner.nextDouble();
        scanner.nextLine();
        bank.addExistingBranchCustomerTransaction(branchName, customerName, transaction);
    }
}
* */