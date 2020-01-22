package udemy.java_programming_masterclass.section8.challenge_arrayList;

import java.util.ArrayList;

public class Contact {
    private String name;
    private int phoneNumber;

    public Contact(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, int phoneNumber) {
        return new Contact(name, phoneNumber);
    }

}
