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


