package codewars.kata3descendingOrder;

import java.util.ArrayList;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code

        // niestety wciąż nie działa ;(

        if (num > 0) {

            int temp = num;
            ArrayList<Integer> array = new ArrayList<Integer>();
            do{
                array.add(temp % 10);
                temp /= 10;
            } while  (temp > 0);

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
        int number = sortDesc(123);
        System.out.println(number);
    }
}
