package testy_i_próby.cwieczenia_java_start.klasy_abstrakcyjne_interfejsy_met_equals;

/**
 * Klasy abstrakcyjne, interfejsy i metoda equals
 * https://www.youtube.com/watch?v=xtelEWWixic
 */

public abstract class TV implements ChangeChannel, Change {
    public abstract void tvOn(boolean b);

    @Override
    public String toString() {
        return "Metoda toString klasy TV";
    }

}
