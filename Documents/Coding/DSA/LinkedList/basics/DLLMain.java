package basics;

public class DLLMain {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(116);
        dll.display();
        dll.addFirst(611);
        dll.display();
        dll.addLast(0);
        dll.display();
        dll.addLast(116);
        dll.display();
        dll.deleteFirst();
        dll.display();
        dll.deleteEnd();
        dll.display();
    }
}