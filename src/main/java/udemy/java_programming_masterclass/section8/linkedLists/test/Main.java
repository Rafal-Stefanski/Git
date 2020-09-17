package udemy.java_programming_masterclass.section8.linkedLists.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println("position " + i + ": given value " + intList.get(i) );
        }

        intList.add(1,22);
        System.out.println("\nadded value: 1 for position 2");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("position " + i + ": given value " + intList.get(i) );
        }

        intList.add(0,432);
        System.out.println("\nadded value: 0 for position 432");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("position " + i + ": given value " + intList.get(i) );
        }

        intList.remove(2);
        System.out.println("\nremoved value from position 2");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("position " + i + ": given value " + intList.get(i) );
        }

    }
}
