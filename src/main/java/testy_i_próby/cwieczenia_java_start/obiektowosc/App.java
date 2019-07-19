package testy_i_próby.cwieczenia_java_start.obiektowosc;

/**
 * Zadanie z: https://www.youtube.com/watch?v=zSATsNzNV0E
 */

public class App {
    public static void main(String[] args) {

        Person pawel = new Person();
        pawel.name = "Paweł";
        pawel.age = 18;
        pawel.isAlive = true;

        Person mikolaj = new Person();
        mikolaj.name = "Mikołaj";
        mikolaj.age = 100;
        mikolaj.isAlive = false;

        pawel.przedstawSie(true);
        mikolaj.przedstawSie(true);
        pawel.przedstawSie(false);
        mikolaj.przedstawSie(false);

        int ileRazy = Person.ileRazySiePrzedstawili();

        System.out.println("\nOsoby przedstawiły się " + ileRazy + " razy.");

    }
}
