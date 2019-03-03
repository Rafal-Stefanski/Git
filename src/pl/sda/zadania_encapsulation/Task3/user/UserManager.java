package pl.sda.zadania_encapsulation.Task3.user;

public class UserManager {
    private UserModel user;

    public void createUser(String firstName, String lastName1, String lastName2, int age) {
        user = new UserModel(firstName, lastName1, lastName2, age);
    }

    protected UserModel getUser() {
        return user;
    }
}
