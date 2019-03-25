package pl.sda.testy_i_próby.udemy;

public class TaskUdemy1 {
    public static void main(String[] args) {
        sayHelloWorld();

        sayHelloTo("charlie");
        sayHelloTo("jasiu");

        int x = returnFive();
        System.out.println(x);

//        f(x) = x * x;
        int result = square(5);
        System.out.println(square(returnFive()));
    }

    static int square(int x) {
        return x * x;
    }

//    return value 5
    private static int returnFive() {
        return 5;
    }
//  says hello to some names
    private static void sayHelloTo(String name) {
        System.out.println("Cześć, " + name);
    }
//  says HeLLo WOrld
    private static void sayHelloWorld() {
        System.out.println("Witaj, świece!");
    }
}
