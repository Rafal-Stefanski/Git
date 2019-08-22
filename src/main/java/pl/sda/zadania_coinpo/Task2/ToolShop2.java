package pl.sda.zadania_coinpo.Task2;

public class ToolShop2 {

    public static void main(String[] args) {
        Hamer2 mlotekNr1 = new Hamer2("Staporkow", 34.90, 5.0);
        Hamer2 mlotekNr3 = new Hamer2("Stanley", 43.60, 6.0);

        Saw2 pilaNr1 = new Saw2("Globus", 120.40, 30);
        Saw2 pilaNr2 = new Saw2("Yato", 145.80, 33);


        System.out.println("Mlotek " + mlotekNr1.getModel() + ", kosztuje: " + mlotekNr1.getPrice() + ",- PLN");
        System.out.println("Mlotek " + mlotekNr3.getModel() + ", kosztuje: " + mlotekNr3.getPrice() + ",- PLN");

        System.out.println("Pila " + pilaNr1.getModel() + ", kosztuje: " + pilaNr1.getPrice() + ",- PLN");
        System.out.println("Pila " + pilaNr2.getModel() + ", kosztuje: " + pilaNr2.getPrice() + ",- PLN");


    }

}
