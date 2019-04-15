package pro1.set;

public class PersonThree implements Person {
    private static int COUNT = 1;
    private int id;
    private String name;
    private String surname;

    public PersonThree(String name, String surname) {
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

    //prawidłowa implementacja metod: equals() i hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonThree that = (PersonThree) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return surname != null ? surname.equals(that.surname) : that.surname == null;
    }

    @Override
    public int hashCode() {
        int result = (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }
}