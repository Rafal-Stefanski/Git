package pl.sda.zadania_arrays;

public class Arrays_Testing3 {
    public static void main(String[] args) {
        String[] nazwy;
        nazwy = new String[6];
        nazwy[0] = "Lenovo";
        nazwy[1] = "Samsung";
        nazwy[2] = "Apple";
        nazwy[3] = "Huawei";
        nazwy[4] = "Xiaomi";
        nazwy[5] = "Roborock";
        System.out.print("Wywołanie 1 wartosci: ");
        System.out.println(nazwy[3]);
        System.out.print("Wywołanie całej tabeli: ");
        for (int i = 0; i < nazwy.length; i++) {
            System.out.print(nazwy[i] + " ");
        }

        String[]nazwyRazem = new String[]{"nazwa Lenovo","Samsung", "Apple", "Huawei", "Xiaomi", "Roborock"};
        System.out.println("n/Deklaracja tablicy razem z innicjalizacją");
        for (String i : nazwyRazem) {
            System.out.print(i + " ");
        }

    }
}
