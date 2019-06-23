package pro2.weekend2.niedz;

public class MyListV3 {
    ElementV3 head;

//    public void add(String value) {
//        if (isEmpty()) {
//            head = new ElementV3(value, null);
//        } else {
//            ElementV3 lastElement = getLastElement();
//        }
//    }

    public boolean isEmpty() {
        return head == null;
    }

//    private ElementV3 getLastElement() {
//        ElementV3 temp = head;
//
//        while (temp.getNext() != null) {
//            temp = temp.getNext();
//        }
//
//        return temp;
//    }
}
