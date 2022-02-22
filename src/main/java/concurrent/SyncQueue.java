package concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Example.
 *
 * @author Igor_Zolov
 */
public class SyncQueue {
    public static void main(String[] args) {
        BlockingQueue<String> syncQueue = new ArrayBlockingQueue<>(5);
//        BlockingQueue<String> syncQueue = new SynchronousQueue<>();
        Runnable producer = () -> {
            int i = 0;
            while (true) try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 1000));
                String value = String.valueOf(i++);
                syncQueue.put(value);
                System.out.println("Produce:" + value);
            } catch (InterruptedException ignored) { } };

        Runnable consumer = () -> {
            while (true) try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                System.err.println("Consume: " + syncQueue.take());
            } catch (InterruptedException ignored) { } };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
