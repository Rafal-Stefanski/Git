package pl.sda.zadania_encapsulation.Task3.user;

public class UserModel {
    private String firstName;
    private String lastName1;
    private String lastName2;
    private  int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName1 + "-" + lastName2;
    }

    public int getAge() {
        return age;
    }

    public UserModel(String firstName, String lastName1, String lastName2, int age) {
        this.firstName = firstName;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.age = age;
    }
}
