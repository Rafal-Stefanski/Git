package stosy;

public class Stacks<E> {

    StackElements<E> root = null;

    public void push(E value) {
        StackElements<E> stackElements = new StackElements<>(value, root);
        root = stackElements;
    }

    public E pop() {
        if (isEmpty()) return null;
        E temp = peek();
        root = root.getNext();
        return temp;
    }

    public E peek() {
        return (E) root.getValue();
    }

    public boolean isEmpty() {
        return root == null;
    }
}