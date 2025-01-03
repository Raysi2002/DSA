package Implementation;

public class StackTesting {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(116);
        stack.push(82);
        stack.push(74);
        stack.push(23);
        stack.display();
        System.out.println("\nPopped Item: " + stack.pop());
        stack.display();
        System.out.println("\nTop item: " + stack.peek());

    }
}
