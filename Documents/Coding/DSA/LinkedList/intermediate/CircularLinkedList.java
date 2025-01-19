package intermediate;

public class CircularLinkedList {
    Node head;
    Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        Node current = head;
        while(current.next != head){
            current = current.next;
        }
        current.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("No data available");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        tail.next = head;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("No data available");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        Node currentNode = head;
        while(currentNode.next.next != head){
            currentNode = currentNode.next;
        }
        tail = currentNode;
        tail.next = head;
    }
    
    public void display(){
        if(head == null){
            System.out.println("No data available in linked list");
            return;
        }
        Node current = head;
        do{
            System.out.print(current.data + "->");
            current = current.next;
        }while(current != head);
        System.out.print("terminated");
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}