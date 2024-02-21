package Assignment_7;

public class Third extends Thread{
    String task;
    Third(String task) {
        this.task = task;
    }
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println( task + ":" + i );
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Third task1 = new Third("FirstThread");
        Third task2 = new Third("SecondThread");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}