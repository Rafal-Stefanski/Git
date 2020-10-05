package udemy.java_programming_masterclass.section12.challenge;

public final class Key {
    private String name;
    private BodyTypes bodyTypes;

    Key(String name, BodyTypes bodyTypes) {
        this.name = name;
        this.bodyTypes = bodyTypes;
    }

    public String getName() {
        return name;
    }

    public BodyTypes getBodyTypes() {
        return bodyTypes;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57 + this.bodyTypes.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Key key = (Key) obj;
        if (this.name.equals(key.getName())) {
            return (this.bodyTypes == key.getBodyTypes());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.bodyTypes;
    }
}
