package pro1.set;

public class PersonTwo implements Person {
    private static int COUNT = 1;
    private int id;
    private String name;
    private String surname;

    public PersonTwo(String name, String surname) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonTwo personTwo = (PersonTwo) o;

        if (name != null ? !name.equals(personTwo.name) : personTwo.name != null) return false;
        return surname != null ? surname.equals(personTwo.surname) : personTwo.surname == null;
    }

    @Override
    public int hashCode() {
        //nieprawidłowa implementacja metody hashCode() - tak się tego nie robi!!
        //hashCode() jest niespójny z metodą equals()
        return id;
    }
}