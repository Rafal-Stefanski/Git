package pl.sda.drzewo_genealogiczne;

public class Person {
    private String firsName;
    private String lastName;
    private int age;

    public Person(String firsName, String lastName, int age) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}

