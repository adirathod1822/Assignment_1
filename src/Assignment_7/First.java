package Assignment_7;

public class First implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread using Runnable interface is running");
    }

    public static void main(String[] args) {
        First f = new First();
        Thread t = new Thread(f);
        t.start();
    }
}
