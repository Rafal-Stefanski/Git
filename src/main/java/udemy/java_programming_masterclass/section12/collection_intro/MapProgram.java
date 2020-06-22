package udemy.java_programming_masterclass.section12.collection_intro;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A compiled high level, object-orientated, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("Lisp", " Therein lies madness");

        System.out.println(languages.get("Java"));
        languages.put("Java", "this course is about Java");
        System.out.println(languages.get("Java"));

        System.out.println("============ ============ ==========");

        for (String key : languages.keySet()) {
            System.out.println(key+" : " + languages.get(key));
        }
    }
}
