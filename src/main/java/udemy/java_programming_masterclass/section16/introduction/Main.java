package udemy.java_programming_masterclass.section16.introduction;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

        System.out.println("\n******** playing around lambdas *************");

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);


        System.out.println("\n********** loop using for ***********");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        }

        System.out.println("\n********** loop using forEach and lambda ***********");
        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

//        System.out.println("\n**********************");
//        for (int i = 0; i < employees.size(); i++) {
//            Employee employee = employees.get(i);
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//        }

    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperConcat(s1, s2);
    }

}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperConcat(String s1, String s2);
}

class AnotherClass {

    public String doSomething() {
        int i = 0;

        /**with Lambda*/
        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expression's class is " + getClass().getSimpleName());
            System.out.println("i in lambda expression = " + i);
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");


        /**without Lambda*/
//        System.out.println("\nThe AnotherClass class's name is: " + getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperConcat(String s1, String s2) {
//                System.out.println("The anonymous class's name is: " + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2");

//        int i = 0;
//

    }

    public void printValue() {
        int number = 25;

        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value is " + number);
        };

        new Thread(r).start();
    }
}