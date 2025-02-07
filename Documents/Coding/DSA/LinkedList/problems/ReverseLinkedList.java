package problems;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(100);
        ll.add(116);
        ll.add(98);
        System.out.println(ll);
        System.out.println(ll.reversed());
        int index = ll.indexOf(116);
        System.out.println(index);
    }
}
