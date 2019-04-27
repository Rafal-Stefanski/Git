package pl.sda.zadania_oop.family;

public class Family {
    Person husband;
    Person wife;
    Person child;
    String name;

    public Family(Person husband, Person wife, Person child, String name) {
        this.husband = husband;
        this.wife = wife;
        this.child = child;
        this.name = name;
    }

    public Person getHusband() {
        return husband;
    }

    public Person getWife() {
        return wife;
    }

    public Person getChild() {
        return child;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Family{" +
                "\nhusband=" + husband +
                "\n, wife=" + wife +
                "\n, child=" + child +
                "\n, name='" + name + '\'' +
                '}';
    }
}
