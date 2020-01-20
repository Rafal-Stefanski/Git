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

    public ArrayList<String> getContacts() {
        return contacts;
    }

    public void storeContacts() {
        contacts.add(name);
    }

    public void printContacts() {
        System.out.println("You have " + contacts.size() + " contacts.");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + " - " + contacts.get(i));
        }
    }
}

/*
* import java.util.ArrayList;

public class Contacts {
    private String name;
    private String number;

    private ArrayList<String> contacts = new ArrayList<String>();


    public Contacts(String name, String number){
        this.name = name;
        this.number = number;
    }



    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }


    public static Contacts createContact(String name, String number){
        return new Contacts(name, number);
    }

    public ArrayList<String> getContacts(){
        return contacts;
    }

    public void storeContacts(String names){
        contacts.add(names);
    }

    public void printContacts(){
        System.out.println("You have "+contacts.size()+ " Contacts in your list. ");
        for (int i=0; i<contacts.size(); i++){
            System.out.println(i+" - " + contacts.get(i));
        }
    }



}






import java.util.ArrayList;

public class mobilePhone {

    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public mobilePhone(String myNumber){
     this.myNumber=myNumber;
     this.myContacts= new ArrayList<Contacts>();
    }
    //adding a new contacts
    public boolean addNewContact( Contacts contact){
        //checking for an existing contact

        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
       }
       //if it is not, you can add it to your contacts

        myContacts.add(contact);
return true;
    }


    //update Contact using a set method
    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition <0){
            System.out.println(oldContact.getName() + " , was not found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName()+ " , was replaced with " + newContact.getName());
        return true;
    }

    //remove contact
    public boolean removeContact(Contacts contact){
        int foundPosition = findContact(contact);
        if (foundPosition<0){
            System.out.println(contact.getName()+ " , was ot found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName()+" . was deleted");
        return true;

    }



    private int findContact(Contacts contact){//find position contact
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i=0; i<myContacts.size(); i++){
            //creating another temporary object to hold the name and compare
            Contacts contacts= this.myContacts.get(i);
            if (contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public  void printContacts(){
        System.out.println("Contact list");
        for (int i=0; i<this.myContacts.size(); i++){
            System.out.println((i+1)+ " . " + this.myContacts.get(i).getNumber());
        }
    }

    public Contacts queryContact(String name){
        int position =findContact(name);
        if (position >=0){
            return this.myContacts.get(position);
        }
        return  null;
    }


}


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static mobilePhone mobilePhone1 = new mobilePhone("000 443 876");

    public static void main(String[] args) {
	boolean quit = false;
	int choice = 0;
	printInstructions();


	while(!quit){
        System.out.println("Enter a choice: ");
        choice =scanner.nextInt();
        scanner.nextLine();


        switch (choice){
            case 0:
                printInstructions();
                break;
            case 1 :
                mobilePhone1.printContacts();
                break;
            case 2:
                addContacts();
                break;
            case 3:
                modifyContacts();
                break;
            case 4:
                deleteContacts();
            break;

            case 5:
                quit=true;
                break;
        }
	}
    }

    public static void printInstructions(){
        System.out.println("\n Press");
        System.out.println("\t 0 - To print a choice");
        System.out.println("\t 1 - To print the list of contacts");
        System.out.println("\t 2 - To add contacts");
        System.out.println("\t 3 - To change contacts");
        System.out.println("\t 4 - To delete contacts");
    }


    private static void addContacts(){
        System.out.println("Enter new Contact Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone Number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if (mobilePhone1.addNewContact(newContact)){
            System.out.println("New contact added: name = " +name+ " , phone" +phone);
        }else{
            System.out.println("Can not add , "+name+" already on file");
        }
    }


    private static void modifyContacts(){
        System.out.println("Enter existing contact name : ");
        String name = scanner.nextLine();
        Contacts extContacts = mobilePhone1.queryContact(name);
        if (extContacts==null){
            System.out.println("Cannot find contact");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName= scanner.nextLine();
        System.out.println("Enter new phone number= ");
        String newNumber = scanner.nextLine();

        Contacts newContacts=Contacts.createContact(newName, newNumber);
        if (mobilePhone1.updateContact(extContacts, newContacts)){
            System.out.println("Updated");
        }else{
            System.out.println("error, try again ");
        }
    }

    private static void deleteContacts(){
        System.out.println("Enter existing contact name: ");
        String name= scanner.nextLine();
        Contacts extContact=mobilePhone1.queryContact(name);
        if (extContact==null){
            System.out.println("Cannot find the contact");
        }
        if (mobilePhone1.removeContact(extContact)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting");
        }
    }

    private static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name= scanner.nextLine();
        Contacts extContact=mobilePhone1.queryContact(name);
        if (extContact==null){
            System.out.println("cannot find contact");

        }
        System.out.println("Name: " + extContact.getName()+ "Phone number is: "+ extContact.getNumber());
    }
    *
    * */
