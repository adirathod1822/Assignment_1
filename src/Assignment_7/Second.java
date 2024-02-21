package Assignment_7;


public class Second extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Thread using thread class is running!!");
    }

    public static void main(String[] args) {
        Second t = new Second();
        t.start();
    }
}
