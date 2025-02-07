package intermediate;

public class SLLMain {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst(19);
        sll.addFirst(116);
        sll.addLast(90);
        sll.addLast(98);
        sll.display();
        System.out.println("\nDeleted Element: " + sll.deleteHead());
        sll.display();
        System.out.println("\nDeleted Element: " + sll.deleteLast());
        sll.display();
        System.out.println("\nElement Index: " + sll.search(200));
        sll.insetAtPos(1, 116);
        sll.display();
        sll.insetAtPos(2, 23);
        System.out.println();
        sll.display();
        sll.reverse();
        System.out.println("\nReversed Linked List");
        sll.display();
    }
}
