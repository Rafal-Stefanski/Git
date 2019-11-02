package udemy.java_programming_masterclass.section6.constructors_p2;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Bob Bobber", 1_000_000.0, "bobbobber@rich.shit");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 5_000.00, emailAddress);
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }





    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
