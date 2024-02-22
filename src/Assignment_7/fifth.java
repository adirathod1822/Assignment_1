package Assignment_7;

public class fifth extends Thread {
    int sleep;
    String msg;
    Thread t;
    public fifth(int sleep, String msg, Thread t){
        this.sleep=sleep;
        this.msg = msg;
        this.t=t;
    }
    public void run() {
        try {
            Thread.sleep(sleep);
            System.out.println("Thread "+msg+" executed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fifth thread1 = new fifth(0,"1",Thread.currentThread());
        fifth thread2 = new fifth(1000,"2",Thread.currentThread());
        thread1.start();
        thread2.start();
        System.out.println("Main ended");
    }
}
