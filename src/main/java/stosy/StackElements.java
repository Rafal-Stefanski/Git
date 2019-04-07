package stosy;

public class StackElements<E> {

    private E value;
    private StackElements next;


    public StackElements(E value, StackElements next) {
        this.value = value;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public StackElements getNext() {
        return next;
    }
}
