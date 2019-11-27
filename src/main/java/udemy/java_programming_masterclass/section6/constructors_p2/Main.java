package udemy.java_programming_masterclass.section6.constructors_p2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Empty constructor, all fields default for no1");
        VipCustomer no1 = new VipCustomer();
        System.out.println(no1.getCreditLimit() + " " + no1.getName() + " " + no1.getEmailAddress());

        System.out.println("\n2 fields given constructor, limit as default for no2");
        VipCustomer no2 = new VipCustomer("Dave", "dave@strage.com");
        System.out.println(no2.getCreditLimit() + " " + no2.getName() + " " + no2.getEmailAddress());

        System.out.println("\n3 fields given constructor, no defaults for no3");
        VipCustomer no3 = new VipCustomer("Bradley Cooper",10_000.00, "bradley@cooper.net");
        System.out.println(no3.getCreditLimit() + " " + no3.getName() + " " + no3.getEmailAddress());

    }
}
