package udemy.java_programming_masterclass.section18.debuger_demo;

public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charAdded = 0;

    public void addChar(StringBuilder sBuilder, char c) {
        this.sBuilder.append(c);
        charAdded++;
    }
}
