package udemy.java_programming_masterclass.section8.challenge_autoboxing_unboxing.code_example;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branchesArray;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchesArray = new ArrayList<>();
    }

    private boolean findBranch(Branch branch) {
        if (branchesArray.indexOf(branch) >= 0) {
            System.out.println(branch.getName() + ", already exist in record.");
            return true;
        } else {
            System.out.println(branch.getName() + ", is new.");
            return false;
        }
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < branchesArray.size(); i++) {
            Branch branch = branchesArray.get(i);
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public void addNewBranch(Branch branch) {
        if (!(findBranch(branch))) {
            branchesArray.add(branch);
            System.out.println(branch.getName() + " has been added.");
        } else {
            System.out.println("Error, " + branch.getName() + " already exist.");
        }
    }


}

/*



    public void addNewBranchCustomer(String branchName, Customer customer) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
                branch.addNewCustomer(customer);
                System.out.println("Customer added to branch");
        } else {
            System.out.println(branchName + " does not exist in record.");
        }
    }

    public void addExistingBranchCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addExistingCustomerTransaction(customerName, transaction);
        } else {
            System.out.println(branchName + " does not exist in record.");
        }
    }

    public void printBranches() {
        System.out.println("There are " + branches.size() + " numbers of branches");

        for (int i = 0; i < branches.size(); i++) {
                System.out.println((i + 1) + ", " + branches.get(i).getName());

        }
    }

    public void printBranchCustomers(String branchName) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.printCustomers();
        } else {
            System.out.println(branchName + " does not exist in record.");
        }
    }

    public void printBranchCustomerTransactions(String branchName, String customerName) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.printTransactions(customerName);
        } else {
            System.out.println(branchName + " does not exist in record.");
        }
    }
}
* */