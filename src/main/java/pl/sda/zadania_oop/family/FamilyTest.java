package pl.sda.zadania_oop.family;

public class FamilyTest {
    public static void main(String[] args) {
        Person husband1 = new Person("Ryszard", "Ochucki", 44);
//        husband1 = null;
//        System.out.println("husband1 = " + husband1);

        Person wife1 = new Person("Ewa", "Ochucka", 34);
        Person child1 = new Person("Tomek", "Ochucki", 10);

        Family family1 = new Family(husband1, wife1, child1, "Rodzina z Misia");
        System.out.println(family1);
    }
}
