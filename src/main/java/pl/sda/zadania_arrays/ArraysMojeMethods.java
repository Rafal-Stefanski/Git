package pl.sda.zadania_arrays;

public class ArraysMojeMethods {

    void drukujArray(String[] stringsMoje) {
        for (int i = 0; i < stringsMoje.length; i++) {
            System.out.println(stringsMoje[i]);
        }
        for (String s : stringsMoje) {
            System.out.println(s);
        }
    }

    public void drukujArrayOpartyNaVarargsach(String... varargs) {
        for (int i = 0; i < varargs.length; i++) {
            System.out.println(varargs [i]);
        }
        for (String s : varargs) {
            System.out.println(s);
        }

    }
}
