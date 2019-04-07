package pro1.arrays;

import java.util.Comparator;

public class PersonByAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1 == null && o2 == null) {
            return 0;
        }

        if(o1 == null) {
            return -1;
        }

        if(o2 == null) {
            return 1;
        }

        return o1.getAge() - o2.getAge();
    }
}
