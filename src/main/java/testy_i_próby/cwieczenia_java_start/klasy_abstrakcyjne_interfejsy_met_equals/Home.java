package testy_i_próby.cwieczenia_java_start.klasy_abstrakcyjne_interfejsy_met_equals;

public class Home {
    public static void main(String[] args) {
        Nosy n = new Nosy();
        System.out.println(n);

        // porównanie obiektów za pomocą == , equals i instanceof

        String s1 = "tekst";
        String s2 = new String("tekst");

        if (s1==s2){
            System.out.println("s1==s2");
        }
        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2)");
        }
        if (s1 instanceof Object) {
            System.out.println("s1 instanceof Object");
        }
        if (n instanceof Object) {                          // wytłumaczenie youtube 14:00
            System.out.println("s1 instanceof Object");
        }





    }





}
