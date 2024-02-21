package Assignment_7;

public class fifth extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread executed after 1 second delay");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fifth thread1 = new fifth();
        fifth thread2 = new fifth();
        thread1.start();
        thread2.start();
    }
}
