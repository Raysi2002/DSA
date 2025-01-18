package basics;

public class DoublyLinkedList {
    private Node head;
    static class Node{
        private Node prev;
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }   

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("No data present");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node currentNode = head.next;
        currentNode.prev = null;
        head.next = null;
        head = currentNode;
        
    }

    public void deleteEnd(){
        if(head == null){
            System.out.println("No data present");
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    public void insertAtPosition(int data, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position, Position must be positive");
            return;
        }
    
        Node newNode = new Node(data);
    
        // Case 1: Insert at the head
        if (pos == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }
    
        // Traverse to the (pos - 1)th node
        int count = 1;
        Node current = head;
    
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }
    
        // If the position is out of bounds
        if (current == null) {
            System.out.println("Index out of bound");
            return;
        }
    
        // Case 2: Insert in the middle or at the tail
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        newNode.prev = current;
        current.next = newNode;
    }
    public void display(){
        if(head.next == null){
            System.out.println("DLL is empty!");
        }
        Node current = head;
        System.out.print("null <- ");
        while(current != null){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


