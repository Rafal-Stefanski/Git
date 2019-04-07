package pro1.arrays;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        if(o == null) {
            return 1;
        }

        if(surname.compareTo(o.surname) != 0) {
            return surname.compareTo(o.surname);
        }

        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return String.format("%s %s - lat: %d", name, surname, age);
    }
}
