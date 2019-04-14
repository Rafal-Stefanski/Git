package pl.sda.sort_zadania;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import pro1.sort_zadania.Table1RandomBubbleSort;

public class Table1RandomBubbleSortTest {

    @Test
    public void shouldSortArrayInAscendingOrder() {
// given
        int[] tab = new int[]{3, 1, 9, 2, 7};

        // when
//        Table1RandomBubbleSort.sort();

        // then
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 7, 9}, tab);
    }
}
