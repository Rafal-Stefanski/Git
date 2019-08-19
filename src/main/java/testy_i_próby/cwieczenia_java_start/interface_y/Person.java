package testy_i_próby.cwieczenia_java_start.interface_y;

import java.io.Serializable;

public class Person implements Comparable<Person>, Runnable, Serializable {

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public void run() {

    }

    public <T> Comparable getName() {
        return null;
    }
}
