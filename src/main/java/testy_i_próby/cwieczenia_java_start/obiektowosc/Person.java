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
    static int ileRazySiePrzedstawili(){
        return ileRazy;
    }
}
