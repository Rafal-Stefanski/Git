package stosy;

public class StackStart {
    public static void main(String[] args) {
        Stacks myStack = new Stacks();
        myStack.push(2);
        myStack.push(3);
        myStack.push(5);
        myStack.push(8);

        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }
}
