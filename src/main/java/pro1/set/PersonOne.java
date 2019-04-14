package pro1.set;

public class PersonOne implements Person {
    private static int COUNT = 1;
    private int id;
    private String name;
    private String surname;

    public PersonOne(String name, String surname) {
        this.id = COUNT++;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return String.format("%s %s(id:%d)",name, surname,  id);
    }
}