package pl.sda.zadania_generics.boxes;

import java.util.List;

public class NumbersBox<T> {
    private List<T> items;

    public NumbersBox(List<T> items) {
        this.items = items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public T getFirstElement() {
        if (isEmpty()) {
            return null;
        }
        return items.get(0);
    }
    public T getLastElement() {
        if (isEmpty()) {
            return null;
        }
        return items.get(items.size() - 1);
    }
    public int getFirstElementAsInt(){
        T firstElement = getFirstElement();
        if (firstElement == null) {
            return 0;
        }
        return getFirstElementAsInt(); // niejasne sprawdzić w kodzie trenerskim
    }
}