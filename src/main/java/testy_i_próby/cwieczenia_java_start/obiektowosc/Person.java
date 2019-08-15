package testy_i_próby.cwieczenia_java_start.obiektowosc;

public class Person {
    String name;
    int age;
    boolean isAlive;

    private static int ileRazy;

    void przedstawSie(boolean formal) {
        ileRazy++;
        if (formal) {
            System.out.println("Dzień dobry, mam na imię " + name + ". Mój wiek to " + age + " lat.");
        } else {
            System.out.println("Cześć, jestem " + name + ". Mam " + age + " lat.");
        }
    }
    int ileRazySiePrzedstawili(){
        return ileRazy;
        // dodanie przedrostka static - pole jest statyczne i jest przypisane do całej klasy,
        // możemy wtedy podać w kasie App, pole Person.ileRazySiePrzedstawili(), zliczając wszystko wystąpienia metody,
        // dla wszystkich obiektów w klasie Person.

        // brak przedrostka static - metoda jest przypisana do obiektu,
        // możemy wtedy podać w kasie App, pole pawel.ileRazySiePrzedstawili()
        // i tak samo mikolaj.ileRazySiePrzedstawili(), zliczając tylko wystąpienia dla poszczególnych obiektów,
        // "pawel" i "mikolaj".

    }
}
