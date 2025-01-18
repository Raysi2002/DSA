package builtin_linkedlist;

import java.util.LinkedList;

public class Basics{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(116);
        list.add(293);
        list.add(239);
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.peekLast());
        System.out.println(list);
        System.out.println(list.peekFirst());
        System.out.println(list);
        System.out.println(list.pollLast());
    }
}