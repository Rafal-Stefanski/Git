package udemy.java_programming_masterclass.section9.innerClasses;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        listen();


//        Gearbox mcLaren = new Gearbox(6);

//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        Gearbox.Gear second = mcLaren.new Gear(2, 15.4);
//        Gearbox.Gear third = mcLaren.new Gear(3, 17.8);
//        System.out.println(first.driveSpeed(1000));

//        mcLaren.operatingClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operatingClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operatingClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operatingClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
