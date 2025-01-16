package basics;
class SinglyLinkedList{

    private Node head;
    private Node tail;
    private int size;
    SinglyLinkedList(){
        this.size = 0;
    }

    static class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data = data;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

    }


}

