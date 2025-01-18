### **Beginner-Level Linked List Problems**

#### **1. Basic Implementation**
1. **Create a Singly Linked List**
   - Implement a singly linked list with basic operations:
     - Insert a node at the beginning.
     - Insert a node at the end.
     - Display the linked list.
   - **Tip:** Start by defining a `Node` class with `data` and `next` attributes.

2. **Create a Doubly Linked List**
   - Implement a doubly linked list with basic operations:
     - Insert a node at the beginning.
     - Insert a node at the end.
     - Traverse the list forward and backward.

#### **2. Search in a Linked List**
- Write a program to search for a given element in a singly linked list.
  - Input: `LinkedList = [1, 2, 3, 4, 5]`, `Target = 3`
  - Output: "Element found at position 3."

#### **3. Delete a Node**
- Delete the first occurrence of a given value in a singly linked list.
  - Input: `LinkedList = [1, 2, 3, 4, 5]`, `Delete = 3`
  - Output: `[1, 2, 4, 5]`

#### **4. Reverse a Linked List**
- Reverse a singly linked list.
  - Input: `LinkedList = [1, 2, 3, 4, 5]`
  - Output: `[5, 4, 3, 2, 1]`
  - **Tip:** Use three pointers (`prev`, `curr`, `next`) to reverse the links.

#### **5. Find the Middle Node**
- Find the middle node of a linked list.
  - Input: `LinkedList = [1, 2, 3, 4, 5]`
  - Output: `3`
  - **Bonus:** Try solving this using the two-pointer technique (slow and fast pointers).

#### **6. Detect a Loop**
- Check if a linked list has a loop.
  - Input: `LinkedList = [1, 2, 3, 4, 5]`, `3 -> 1` (loop)
  - Output: "Loop detected."
  - **Tip:** Use Floyd’s Cycle Detection Algorithm (slow and fast pointers).

#### **7. Merge Two Sorted Lists**
- Merge two sorted linked lists into a single sorted linked list.
  - Input: `List1 = [1, 3, 5]`, `List2 = [2, 4, 6]`
  - Output: `[1, 2, 3, 4, 5, 6]`

#### **8. Remove Duplicates**
- Remove duplicates from a sorted singly linked list.
  - Input: `LinkedList = [1, 1, 2, 3, 3]`
  - Output: `[1, 2, 3]`

#### **9. Check if a Linked List is a Palindrome**
- Determine if a singly linked list is a palindrome.
  - Input: `LinkedList = [1, 2, 3, 2, 1]`
  - Output: "Palindrome."

#### **10. Insert in the Middle**
- Insert a node at a specific position in a singly linked list.
  - Input: `LinkedList = [1, 2, 4, 5]`, `Insert 3 at position 3`
  - Output: `[1, 2, 3, 4, 5]`

---

### **Bonus Problems**
1. **Remove N-th Node from the End**
   - Remove the N-th node from the end of a singly linked list.
   - Input: `LinkedList = [1, 2, 3, 4, 5]`, `N = 2`
   - Output: `[1, 2, 3, 5]`

2. **Intersection of Two Linked Lists**
   - Find the node where two singly linked lists intersect.
   - Input: `List1 = [1, 2, 3, 4, 5]`, `List2 = [6, 4, 5]` (intersection at 4)
   - Output: `4`

3. **Split a Circular Linked List**
   - Split a circular linked list into two halves.
   - Input: `[1, 2, 3, 4, 5]` (circular)
   - Output: `List1 = [1, 2, 3]`, `List2 = [4, 5]`

---
