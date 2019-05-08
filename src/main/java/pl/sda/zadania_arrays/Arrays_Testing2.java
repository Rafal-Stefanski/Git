package pl.sda.zadania_arrays;

public class Arrays_Testing2 {
    public static void main(String[] args) {
        ArraysMethods arrays = new ArraysMethods();

        String[] strings = {"Toshiba", "Lenovo", "Dell", "HP"};
        arrays.printArray(strings);

        arrays.printArrayBasedOnVarargs("Toshiba", "Lenovo", "Dell", "HP", "Apple");
//        ===========================================================
        ArraysMojeMethods arraysMoje = new ArraysMojeMethods();

        System.out.println("\nMoje próby z tablicami i metodami.\n");

        String[] stringsMoje = {"Samsung", "Xiaomi", "Huawei", "Pixel", "==="};
        arraysMoje.drukujArray(stringsMoje);

        arraysMoje.drukujArrayOpartyNaVarargsach("Coś", "Ktoś", "Gdzieś", "Kiedyś", "===");
    }
}
