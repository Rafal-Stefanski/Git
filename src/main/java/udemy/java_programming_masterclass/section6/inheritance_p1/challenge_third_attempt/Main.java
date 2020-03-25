package udemy.java_programming_masterclass.section6.inheritance_p1.challenge_third_attempt;

public class Main {
    public static void main(String[] args) {
        Convertable miata = new Convertable("Mazda", "2 door car", "Mx5", 4, true, 1, "soft top");
        Car bmw = new Car("Mazda", "2 door car", "Mx5", 4, false, 1);

        miata.accelerate(4);

        miata.openRoof(false);

//        miata.changeGear(3);

        miata.accelerate(34);



    }
}
