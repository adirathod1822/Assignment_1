package Assignment_9;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

// Task interface defining the contract for tasks to be executed
interface Task {
    void execute();
}

// WorkerNode class representing individual computing units capable of executing tasks
class WorkerNode extends Thread {
    private Queue<Task> taskQueue = new ConcurrentLinkedQueue<>();

    public void addTask(Task task) {
        taskQueue.offer(task);
    }

    @Override
    public void run() {
        while (true) {
            Task task = taskQueue.poll();
            if (task != null) {
                task.execute();
            }
        }
    }
}

// MasterNode class responsible for coordinating task distribution to worker nodes and collecting results
class MasterNode {
    private List<WorkerNode> workers = new ArrayList<>();

    public MasterNode(int numWorkers) {
        // Create worker nodes
        for (int i = 0; i < numWorkers; i++) {
            WorkerNode worker = new WorkerNode();
            workers.add(worker);
            worker.start();
        }
    }

    public void distributeTask(Task task) {
        // Load balancing: Distribute tasks evenly among worker nodes
        int index = (int) (Math.random() * workers.size());
        workers.get(index).addTask(task);
    }

    // Collect results from worker nodes (if needed)
    // Add synchronization if necessary
}

// Example task implementation
class ExampleTask implements Task {
    private String name;

    public ExampleTask(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Executing task: " + name);
        // Task execution logic
    }
}

// Main class to demonstrate the usage of the distributed task execution framework
public class DistributedTaskExecutionFramework {
    public static void main(String[] args) {
        // Create master node with a specified number of worker nodes
        MasterNode masterNode = new MasterNode(1); // Example: 4 worker nodes

        // Example tasks
        Task task1 = new ExampleTask("Task 1");
        Task task2 = new ExampleTask("Task 2");
        Task task3 = new ExampleTask("Task 3");

        // Distribute tasks to worker nodes
        masterNode.distributeTask(task1);
        masterNode.distributeTask(task2);
        masterNode.distributeTask(task3);

        // Add more tasks as needed
    }
}