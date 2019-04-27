package pl.sda.zadania_oop.family;

public class Person {
    String name;
    String surenameName;
    int age;

//    ======= constructor ========

    public Person (String name, String sureName, int age) {
        this.name = name;
        this.surenameName = sureName;
        this.age = age;
    }

//    ======= getter auto =========

    public String getName() {
        return name;
    }

    public String getSurenameName() {
        return surenameName;
    }

    public int getAge() {
        return age;
    }


//    ======= Method override auto =======

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surnameName='" + surenameName + '\'' +
                ", age=" + age +
                '}';
    }

}
