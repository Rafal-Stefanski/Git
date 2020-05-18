package udemy.java_programming_masterclass.section9.challenge_abstract;

public interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse(ListItem root);


}
