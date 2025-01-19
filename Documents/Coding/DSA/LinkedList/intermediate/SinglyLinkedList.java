// implement these things
// 1. Basic operations like insert, delete from both ends
// 2. Intermediate operations like insert in between, insert at position
// 3. Advance operations like, reverseList


package intermediate;

public class SinglyLinkedList {
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
        if(head == null)
            head = newNode;
        else{
            newNode.next = head;
            head = newNode; 
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public int deleteHead(){
        if(head == null)
            return -1;
        else{
            int deleted = head.data;
            head = head.next;
            return deleted;
        }
    }

    public int deleteLast(){
        if(head == null){
            return -1;
        }else{
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            int deleted = current.next.data;
            current.next = null;
            return deleted;
        }
    }

    public int search(int target){
        if(head == null)
        return -1;
        else{
            Node current = head;
            int count = 1;
            if(head.data == target)
                return 1;
            while (current.data != target && current.next != null) {
                current = current.next;
                count++;
            }
            if(current.next == null)
                return -1;
            return count;
        }
    }

    public void insetAtPos(int pos, int data){
        if(pos > 1){
            System.out.println("No such index present in the linkedlsit");
            return;
        }
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int count = 1;
        while (count < pos - 1 && current != null) {
            count++;
            current = current.next;
        }
        if(current == null){
            System.out.println("Index out of bound");
            return;
        }else{
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void display(){
        if(head == null)
            System.out.println("No data present");
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }
}