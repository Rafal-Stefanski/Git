package pro2.weekend2.niedz;

public class ElementV3 {

    private String value;
    private ElementV3 next;


    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(ElementV3 next) {
        this.next = next;
    }

    public ElementV3(String value, ElementV3 next) {
        this.value = value;
        this.next = next;
    }
}
