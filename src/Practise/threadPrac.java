package Practise;

public class threadPrac implements Runnable{
    @Override
    public void run() {
        System.out.println("Hi im thread");
    }

    public static void main(String[] args) {
        threadPrac t = new threadPrac();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
