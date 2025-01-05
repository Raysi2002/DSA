package queue_problems;

import java.util.ArrayList;

public class Implementation {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.insert(116);
        queue.insert(611);
        queue.insert(98);
        queue.display();
        System.out.print("\n" + queue.delete());
        System.out.print("\n" + queue.top());
        queue.display();
    }
}

class Queue{
    static ArrayList<Integer> queue = new ArrayList<>();
    static int top = 0;
    public Queue(){
    }

    public static void insert(int data){
        queue.add(data);
    }

    public static int delete(){
        int data = queue.remove(top);
        return data;
    }

    public static int top(){
        return queue.get(top);
    }

    public static void display(){
        System.out.println("ELEMENTS OF QUEUE");
        for(Integer element : queue){
            System.out.print("\n" + element + "    ");
        }
    }
}
