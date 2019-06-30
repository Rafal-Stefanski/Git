package pro2.weekend3.przykladWieleWatkow;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        final AtomicInteger liczbyParzyste = new AtomicInteger(0);
        for (int i = 1; i <= 100_000; i++) {
            final int finalI = i;

            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    if (finalI % 2 == 0) {
                        liczbyParzyste.incrementAndGet();
                    }
                }
            });
        }

        threadPool.shutdown();
        threadPool.awaitTermination(1, TimeUnit.HOURS);

        System.out.println("Liczb parzystych jest: " + liczbyParzyste.get());
    }
}
