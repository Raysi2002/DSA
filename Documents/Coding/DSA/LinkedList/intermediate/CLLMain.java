package intermediate;

public class CLLMain {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addFirst(19);
        cll.addFirst(116);
        cll.addFirst(90);
        cll.display();
        cll.addLast(876);
        cll.addLast(98);
        System.out.println();
        cll.display();
        cll.deleteFirst();
        System.out.println();
        cll.display();
        cll.deleteLast();
        System.out.println();
        cll.display();
        cll.deleteLast();
        System.out.println();
        cll.display();
    }
}
