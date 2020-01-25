package udemy.short_java_courses;


public class TaskUdemyClassesAndObjects {
    public static void main(String[] args) {

        TaskUdemyPerson john = new TaskUdemyPerson("John");
        john.setAge(20);
        TaskUdemyPerson bob = new TaskUdemyPerson("Bob");
        bob.setAge(25);

        john.sayHelloTo(bob);
        bob.sayHelloTo(john);

        System.out.println(john.getName() + " is " + john.getAge() + " years old.");
        System.out.println(bob.getName() + " is " + bob.getAge() + " years old.");
    }
}
