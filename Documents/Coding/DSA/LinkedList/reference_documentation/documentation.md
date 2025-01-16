# Linked Lists and Their Implementation in Java

## What is a Linked List?

A Linked List is a linear data structure in which elements (nodes) are connected using pointers. Each node contains:
1. Data: The actual value of the element
2. Pointer (next): A reference to the next node in the sequence

## Types of Linked Lists

### 1. Singly Linked List
- Each node points to the next node
- The last node points to null

### 2. Doubly Linked List
Each node has two references:
- One pointing to the next node
- One pointing to the previous node

### 3. Circular Linked List
Two variations:
- Singly Circular: The last node points to the first node
- Doubly Circular: The first node's previous points to the last node, and the last node's next points to the first node

## Advantages of Linked Lists

- Dynamic Size: Can grow or shrink dynamically, unlike arrays
- Efficient Insertions/Deletions: No need for resizing or shifting elements as in arrays
- Efficient Memory Utilization: Nodes are created only as needed

## Disadvantages of Linked Lists

- Sequential Access: Accessing an element takes O(n) time as there's no direct indexing
- Memory Overhead: Each node requires extra memory for pointers

## Operations on Linked List

### 1. Insertion
Add a new node:
- At the beginning
- At the end
- At a specific position

### 2. Deletion
Remove a node:
- From the beginning
- From the end
- From a specific position

### 3. Other Operations
- Traversal: Access each node sequentially
- Search: Find a node containing a specific value
- Reverse: Reverse the linked list

## Java Implementation

### 1. Singly Linked List

```java
class SinglyLinkedList {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Add at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete a node from the beginning
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    // Delete a node from the end
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.display(); // Output: 20 -> 10 -> 30 -> null
        list.deleteFirst();
        list.display(); // Output: 10 -> 30 -> null
        list.deleteLast();
        list.display(); // Output: 10 -> null
    }
}
```

### 2. Doubly Linked List

```java
class DoublyLinkedList {
    // Node class
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;

    // Add at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    // Delete from the beginning
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next != null) {
            head.next.prev = null;
        }
        head = head.next;
    }

    // Delete from the end
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.prev.next = null;
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);
        list.display(); // Output: 5 <-> 10 <-> 20 <-> null
        list.deleteFirst();
        list.display(); // Output: 10 <-> 20 <-> null
        list.deleteLast();
        list.display(); // Output: 10 <-> null
    }
}
```

### 3. Circular Linked List

```java
class CircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Add to the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display(); // Output: 10 -> 20 -> 30 -> (head)
    }
}
```

## Time Complexities

| Operation | Singly Linked List | Doubly Linked List | Circular Linked List |
|-----------|-------------------|-------------------|---------------------|
| Insertion | O(1) at head, O(n) at tail | O(1) at head, O(n) at tail | O(n) |
| Deletion | O(1) at head, O(n) at tail | O(1) at head, O(n) at tail | O(n) |
| Search/Access | O(n) | O(n) | O(n) |