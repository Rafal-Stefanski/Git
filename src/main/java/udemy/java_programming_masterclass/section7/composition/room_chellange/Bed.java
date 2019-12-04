package udemy.java_programming_masterclass.section7.composition.room_chellange;

public class Bed {
    private String styles;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String styles, int pillows, int height, int sheets, int quilt) {
        this.styles = styles;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("Bed -> making");
    }

    public String getStyles() {
        return styles;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
