package udemy.java_programming_masterclass.section8.challenge_arrayList;

import java.util.ArrayList;

public class Contacts {
    private String name;
    private int phoneNumber;

    private ArrayList<String> contacts = new ArrayList<String>();

    public Contacts(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts addContact(String name, int phoneNumber) {
        return new Contacts(name, phoneNumber);
    }


}
