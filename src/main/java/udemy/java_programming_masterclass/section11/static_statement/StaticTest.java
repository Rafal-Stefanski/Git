package udemy.java_programming_masterclass.section11.static_statement;
    /**
     * Created by me on 16-06-2020.
     */
public class StaticTest {
    private static int numInstances = 0;
    private String name;

        public StaticTest(String name) {
            this.name = name;
            numInstances++;
        }

        public static int getNumInstances() {
            return numInstances;
        }

        public String getName() {
            return name;
        }
    }
