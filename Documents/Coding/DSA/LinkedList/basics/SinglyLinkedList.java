package basics;
class SinglyLinkedList{

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void addEnd(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    public void deleteFirst(){
        Node current = head;
        if(head == null)
            System.out.println("Linked list is already empty");
        head = current.next;
        System.out.println("Deleted Data: " + current.data);
    }

    public void deleteEnd(){
        Node current = head;
        if(current.next == null){
            System.out.println("No data present");
            return;
        }
        while(current.next.next != null){
            current.next = current.next.next;
        }
        current.next.next = null;
        
    }

    public void display(){
        if(head == null)
            System.out.println("No data present!");
        
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "-> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

}
