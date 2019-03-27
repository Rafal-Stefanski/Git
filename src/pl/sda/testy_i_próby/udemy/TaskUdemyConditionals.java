package pl.sda.testy_i_próby.udemy;

public class TaskUdemyConditionals {
    public static void main(String[] args) {
        boolean sayHello = false;
        boolean sayHey = false;

        if (sayHello) {
            System.out.println("Cześć");
        } else if (sayHey) {
            System.out.println("Hej");
                } else {
            System.out.println("Na razie");
        }
        if (true && true) {
            System.out.println("AND executed");
        }
        if (true || false) {
            System.out.println("OR executed");
        }
    }

}
