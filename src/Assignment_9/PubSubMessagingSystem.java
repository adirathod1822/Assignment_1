//package Assignment_9;
//
//import java.util.Queue;
//import java.util.concurrent.ConcurrentLinkedQueue;
//
//class Message {
//    private String content;
//
//    public Message(String content) {
//        this.content = content;
//    }
//
//    public String getContent() {
//        return content;
//    }
//}
//
//class MessageQueue {
//    private Queue<Message> queue = new ConcurrentLinkedQueue<>();
//
//    public void publish(Message message) {
//        queue.offer(message);
//    }
//
//    public Message subscribe() {
//        return queue.poll();
//    }
//}
//class Publisher {
//    private MessageQueue messageQueue;
//
//    public Publisher(MessageQueue messageQueue) {
//        this.messageQueue = messageQueue;
//    }
//
//    public void publishMessage(String content) {
//        Message message = new Message(content);
//        messageQueue.publish(message);
//    }
//}
//class Subscriber {
//    private MessageQueue messageQueue;
//
//    public Subscriber(MessageQueue messageQueue) {
//        this.messageQueue = messageQueue;
//    }
//
//    public void subscribeToMessages() {
//        while (true) {
//            Message message = messageQueue.subscribe();
//            if (message != null) {
//                processMessage(message);
//            }
//        }
//    }
//
//    private void processMessage(Message message) {
//        System.out.println("Received message: " + message.getContent());
//    }
//}
//
//public class PubSubMessagingSystem {
//    public static void main(String[] args) {
//
//        MessageQueue messageQueue = new MessageQueue();
//
//        Publisher publisher = new Publisher(messageQueue);
//        Subscriber subscriber = new Subscriber(messageQueue);
//
//        Thread subscriberThread = new Thread(subscriber::subscribeToMessages);
//        subscriberThread.start();
//
//        publisher.publishMessage("Message 1");
//        publisher.publishMessage("Message 2");
//        publisher.publishMessage("Message 3");
//    }
//}
