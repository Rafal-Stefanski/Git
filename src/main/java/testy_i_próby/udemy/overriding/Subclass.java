package testy_i_próby.udemy.overriding;

// Subclass dziedziczy zmienne i metody zdefioniowane w Base
public class Subclass extends Base {
    public static void main(String[] args) {
        Subclass s = new Subclass();

    }

    public Subclass() {
        sayHello(); // calling sayHello method zdefiniowanej w class Base
    }

    @Override
    public void sayHello() {
//        super.sayHello();

        System.out.println("Hi!");
    }
}
