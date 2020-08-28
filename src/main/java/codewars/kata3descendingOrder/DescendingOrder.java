package codewars.kata3descendingOrder;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        if (num > 0) {

            int temp = num;
            ArrayList<Integer> array = new ArrayList<>();
            do{
                array.add(temp % 10);
                temp /= 10;
            } while  (temp > 0);
            Collections.sort(array);
            Collections.reverse(array);
            return DescendingOrder.toInt(array);
        } else {
            return 0;
        }

    }

    public static int toInt(ArrayList<Integer> array) {
        int result = 0;
        int offset = 1;
        for(int i = array.toArray().length - 1; i >= 0; i--) {
            result += array.get(i) *offset;
            offset *= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        // for checkup, and it works!
        int number = sortDesc(123456789);
        System.out.println("987654321");
        System.out.println(number);
        int number1 = sortDesc(145263);
        System.out.println("654321");
        System.out.println(number1);
    }
}
