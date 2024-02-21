package Practise;

public class threadPrac2 extends Thread{
    @Override
    public void run() {
        super.run();
        int i =1;
        int j=2;
        System.out.println(i+j);
    }

    public static void main(String[] args) {
        threadPrac2 p = new threadPrac2();
        p.start();
        p.run();
    }
}
