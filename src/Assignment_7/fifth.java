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
//            if(Thread.currentThread().isAlive())System.out.println("main thread");
//            else System.out.println("dead");
            System.out.println(t.getName());
            System.out.println(t.isAlive());
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fifth thread1 = new fifth(0,"1",Thread.currentThread());
        fifth thread2 = new fifth(1000,"2",Thread.currentThread());
        thread1.start();
        thread2.start();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
        System.out.println("Main ended");
//        else System.out.println("dead");
    }
}
