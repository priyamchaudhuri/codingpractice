import java.util.concurrent.Executors;

public class ExecutorService {

    public static void main(String[] args) {
        int coreCount=Runtime.getRuntime().availableProcessors();
        System.out.println(coreCount);
        java.util.concurrent.ExecutorService service= Executors.newFixedThreadPool(coreCount);
        for (int i = 0; i < 100; i++) {
            service.execute(new Task());
        }
        service.shutdown();
    }

    static class Task implements Runnable{
        @Override
        public void run() {
             System.out.println(Thread.currentThread().getName());
        }
    }
}
