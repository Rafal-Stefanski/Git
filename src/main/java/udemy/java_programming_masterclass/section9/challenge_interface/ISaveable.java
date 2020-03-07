package udemy.java_programming_masterclass.section9.challenge_interface;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
