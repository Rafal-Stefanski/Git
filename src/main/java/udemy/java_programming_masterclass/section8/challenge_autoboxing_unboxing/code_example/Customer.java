package udemy.java_programming_masterclass.section8.challenge_autoboxing_unboxing.code_example;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double transaction;
    private ArrayList<Double> transactionsArrayList;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transaction = transaction;
        this.transactionsArrayList = new ArrayList<>();
        transactionsArrayList.add(transaction);
    }

    public String getName() {
        return name;
    }

    public double getTransaction() {
        return transaction;
    }

    public ArrayList<Double> getTransactionsArrayList() {
        return transactionsArrayList;
    }

    public void printTransactionsArrayList() {
        for (int i = 0; i < transactionsArrayList.size(); i++) {
            System.out.println((i+1) + ", " + transactionsArrayList.get(i));
        }
    }
}
