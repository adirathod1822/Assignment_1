package Practise;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class Message{
    private String Message;
    public Message(String msg){
        this.Message = msg;
    }

    public String getMessage() {
        return Message;
    }
}

class Subscriber{
    String subName;

    public Subscriber(String subName) {
        this.subName = subName;
    }

}

class Publisher{
   private Queue<Subscriber> mQ = new ConcurrentLinkedQueue<>();

    public void subscribe(Subscriber sb){
        mQ.offer(sb);
    }

}

public class newPubSub {
    public static void main(String[] args) {

    }
}
