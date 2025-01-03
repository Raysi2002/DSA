package queue;

class Queue{
    private int[] queue = new int[10];
    private int index = 0;

    public void add(int data){
        queue[index] = data;
        index++;
    }
    public int delete(){
        int temp = index - 1;
        index--;
        return queue[temp];
    }
    public void peek(){
        int temp = index - 1;
        System.out.println("\nPeek: " + queue[temp]);
    }
    public void display(){
        System.out.println("Queue Data: ");
        for(int i = 0; i < index; i++){
            System.out.print(queue[i] + "  ");
        }
    }
}