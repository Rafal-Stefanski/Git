package pl.sda.testy_i_próby.udemy;

public class TaskUdemyPerson {
    String name;        //instance variable
    int age;

    public TaskUdemyPerson(String name) {
        this.name = name;
        System.out.println("Person created");
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

    public void sayHelloTo(TaskUdemyPerson person) {
        System.out.println(getName() + " said hello to " +  person.getName());

    }
}
