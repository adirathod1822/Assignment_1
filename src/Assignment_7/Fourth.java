package Assignment_7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Fourth {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {}
        System.out.println("All threads are finished");
    }
}

class WorkerThread implements Runnable{
    String message;

    WorkerThread(String message){
        this.message=message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ", Message: " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + ", End of Thread " );

    }
    public void processMessage(){
        try{
            Thread.sleep(200);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

