package testy_i_próby.cwieczenia_java_start.dziedziczenie;

public class Animal {

    private int size;

    public void speak() {
        System.out.println(" ");
    }

    public void setSize(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}
