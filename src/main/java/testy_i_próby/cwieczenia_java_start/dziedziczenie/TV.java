package testy_i_próby.cwieczenia_java_start.dziedziczenie;

public class TV {
    private int size;
    private String name;
    private boolean onOff;

    public TV() {

    }

    public TV(int aSize, String name) {
        size = aSize;
        this.name = name;
    }

    public int getSize() {
        return size;
    }


    public String getName() {
        return name;
    }

    public void setOnOff(boolean a) {
        onOff = a;

    }

    public void getOnOff() {
        if (onOff) {
            System.out.println("TV is ON.");
        } else {
            System.out.println("TV is OFF.");
        }
    }



}
