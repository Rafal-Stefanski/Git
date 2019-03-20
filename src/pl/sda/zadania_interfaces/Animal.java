package pl.sda.zadania_interfaces;

public interface Animal {
    String getName();
    String speak();

    default void print() {
        System.out.println(getName());
        System.out.println(speak());
    }
}
