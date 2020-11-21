package udemy.java_programming_masterclass.section15.politeWorker;

public class Main {
    public static void main(String[] args) {
        final Worker worker1 = new Worker("Worker 1", true);
        final Worker worker2 = new Worker("Worker 2", true);

        final ShareResource shareResource = new ShareResource(worker1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker1.work(shareResource, worker2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker2.work(shareResource, worker1);
            }
        }).start();

    }
}
