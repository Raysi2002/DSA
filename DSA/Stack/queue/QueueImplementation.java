package queue;
public class QueueImplementation {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(116);
        queue.add(22);
        queue.add(87);
        queue.display();
        queue.peek();
        queue.delete();
        queue.delete();
        queue.display();
        queue.peek();
    }
}