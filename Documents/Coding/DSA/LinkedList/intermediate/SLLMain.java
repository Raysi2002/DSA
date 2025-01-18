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
    }

}
