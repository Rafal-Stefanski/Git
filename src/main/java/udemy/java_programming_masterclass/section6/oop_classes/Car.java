package udemy.java_programming_masterclass.section6.oop_classes;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("comodore")) {
            this.model = model;
        } else {
            this.model = "Unkown";
        }
//        this.model = zmodel;
    }

    public String getModel() {
        return this.model;
    }
}
