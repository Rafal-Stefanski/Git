package pl.sda.drzewo_genealogiczne;

public class FamilyTest {
    public static void main(String[] args) {

        Person husband1 = new Person("Ryszard", "Ochucki", 44);
        System.out.println("husband1 = " +husband1 );
        Person wife1 = new Person("Ewa", "Ochucka", 24);
        Person child1 = new Person("Tomek","Ochucki", 10);

        Family family1 = new Family(husband1, wife1, child1, "Rodzina Ochuckich");
        System.out.println(family1);
    }
}
