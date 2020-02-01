package udemy.java_programming_masterclass.section8.challenge_autoboxing_unboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customersArrayList;

    public Branch(String name) {
        this.name = name;
        this.customersArrayList = new ArrayList<>();
    }

    public Branch createBranch(String name) {
        return new Branch(name);
    }

    public String getName() {
        return name;
    }

    private boolean findCustomer(Customer customer) {
        if (customersArrayList.indexOf(customer) >= 0) {
            System.out.println(customer.getName() + ", already exist in record.");
            return true;
        } else {
            System.out.println(customer.getName() + ", is new");
            return false;
        }
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < customersArrayList.size(); i++) {
            Customer customer = customersArrayList.get(i);
            if (customer.getName().equals(name)) {
                System.out.println(name + ", already exist.");
                return customer;
            }
        }
        return null;
    }

    public void addNewCustomer(Customer customer) {
        if (!(findCustomer(customer))) {
            customersArrayList.add(customer);
            System.out.println(customer.getName() + " has been added.");
        } else {
            System.out.println("Error, " + customer.getName() + " already exist.");
        }
    }

    public void addExistingCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.getTransactionsArrayList().add(transaction);
            System.out.println("Transaction added for " + customer.getName());
        } else {
            System.out.println(name + " is new customer; needs to register before conducting transactions.");
        }
    }


    // poniżej uzupełnione.


    public void printCustomers() {
        for (int i = 0; i < customersArrayList.size(); i++) {
            System.out.println((i + 1) + ", " + customersArrayList.get(i).getName());
        }
    }

    public void printTransactions(String customerName) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.printTransactionsArrayList();
        } else {
            System.out.println(customerName + " does not exist in record.");
        }
    }
}
