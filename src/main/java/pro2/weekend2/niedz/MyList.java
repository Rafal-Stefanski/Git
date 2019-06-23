package pro2.weekend2.niedz;

public class MyList {
    ListElement head;

    public void add(int value) {
        if (head == null) {
            head = new ListElement(value, null);
        } else {
            ListElement temp;
            temp = head;
//            while (temp) {
//            }
            new ListElement(value, head);
        }
//        boolean next;
//        if (next = true) {
//            new ListElement(value, next);
//        }

//        ListElement next;
//        if (ListElement(value,)) {
//
//        }


    }





//    public MyList(int initialCapacity) {
//        if (initialCapacity > 0) {
//            this.elementData = new Object[initialCapacity];
//        } else if (initialCapacity == 0) {
//            this.elementData = EMPTY_ELEMENTDATA;
//        } else {
//            throw new IllegalArgumentException("Illegal Capacity: "+
//                    initialCapacity);
//        }
//    }

//    public static void main(String[] args) {
//        MyList<G> myList = new MyList();
//
//    }
}
