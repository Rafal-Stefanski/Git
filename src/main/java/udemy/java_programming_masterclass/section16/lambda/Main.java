package udemy.java_programming_masterclass.section16.lambda;

public class Main {

    public static void main(String[] args) {

//        using external class
//        new Thread(new CodeToRun()).start();

//        or
//        using creating new instance inside the class
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the Runnable");
//            }
//        }).start();

//        or
//        using Lambda expression
//        new Thread(()-> System.out.println("Printing from the Runnable")).start();

//        or
//        Lambda with many lines and curly braces
        new Thread(()-> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.format("This is line %d\n", 3);
            }).start();
    }
}

class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing the Runnable");
    }
}

