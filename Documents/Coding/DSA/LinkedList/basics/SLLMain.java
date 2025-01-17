package basics;

public class SLLMain {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.addEnd(232);
        ll.display();
        ll.addFirst(116);
        ll.display();
        ll.addFirst(611);
        ll.display();
        ll.addEnd(11);
        ll.display();
        ll.deleteFirst();
        ll.deleteEnd();
        ll.display();
    }
}
