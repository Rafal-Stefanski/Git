package pro2.weekend3.task1JasIMalgosia;

import java.util.concurrent.CountDownLatch;

public class JasIMalgosia {

    public static void main(String[] args) {
        CountDownLatch waitingLatch = new CountDownLatch(2);

        Thread Jas = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Przygotowanie jedzenia i sniadanie");
                    Thread.sleep(5000);
                    System.out.println("Po śniadaniu");
                    System.out.println("Prysznic");
                    Thread.sleep(3000);
                    System.out.println("Po prysznicu");
                    System.out.println("Ubieranie");
                    Thread.sleep(1000);
                    System.out.println("Ubrany");
                    System.out.println("Wyjście po zakupy");
                    Thread.sleep(15000);
                    System.out.println("Powrót z zakupami");
                    System.out.println("Granie na konsoli");
                    Thread.sleep(5000);
                    System.out.println("Po graniu");
                    waitingLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread Malgosia = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Poranne bieganie");
                    Thread.sleep(6000);
                    System.out.println("Po bieganiu");
                    System.out.println("Prysznic");
                    Thread.sleep(2000);
                    System.out.println("Po prysznicu");
                    System.out.println("Jedzenie sniadanie");
                    Thread.sleep(1000);
                    System.out.println("Po śniadaniu");
                    System.out.println("Ubieranie");
                    Thread.sleep(1000);
                    System.out.println("Ubrana");
                    System.out.println("Spotkanie z koleżanką");
                    Thread.sleep(25000);
                    System.out.println("Po spotkaniu z koleżanką.");
                    waitingLatch.countDown();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Jas.start();
        Malgosia.start();

//        try {
//            Jas.join();
//            Malgosia.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        
//        System.out.println("Koniec dnia!");

        try {
            waitingLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed.");

    }

}
