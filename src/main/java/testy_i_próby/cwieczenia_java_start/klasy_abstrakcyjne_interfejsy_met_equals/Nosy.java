package testy_i_próby.cwieczenia_java_start.klasy_abstrakcyjne_interfejsy_met_equals;

public class Nosy extends TV {


    @Override
    public void tvOn(boolean b) {
        if (b) {
            System.out.println("TV is ON");
        } else {
            System.out.println("TV is OFF");
        }


    }

    @Override
    public String toString() {
        return "Metoda toString klasy Nosy";
    }

    @Override
    public void changeChannel() {
        System.out.println("Zmiana kanału");
    }



    //    @Override
//    public String toString() {
//        return "Nosy{}";
//    }
}
