package udemy.java_programming_masterclass.section8.autoboxing_unboxing;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>(); -> niewykonalne, ponieważ int jest typem prymitywnym
//        i nie może być użyty w Arraylist<>
//        Przykład zastosowania zewnętrznej klasy aby było mozna umieszczać typ prymitywny w ArrayList<>:
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

//        Tutaj to samo ale przy użyciu Wrapperów czyli klas opakowujących:
        Integer integer = new Integer(54);
        Double aDouble = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; //Integer.valueOf(56); // można podać wartość 56 zamiast Integer.valueOf(56)
        int myInt = myIntValue.intValue(); // java widzi jako: myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.00; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);

        }
    }
}
