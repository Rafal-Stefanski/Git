package pl.sda.drzewo_genealogiczne;

public class Family {
    Person husband;
    Person wife;
    Person child;
    String name;

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

    public Family(Person husband, Person wife, Person child, String name) {
        this.husband = husband;
        this.wife = wife;
        this.child = child;
        this.name = name;



    }

}
