package stack;

public class StackLinkedList {

    // Node class to represent each element of the stack
    private class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }

    private Node top; // top of the stack
    private int size; // to keep track of stack size

    // Constructor to initialize the stack
    public StackLinkedList() {
        top = null;
        size = 0;
    }

    // Push function to add an element to the stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.nextNode = top;
            top = newNode;
        }
        size++;
    }

    // Pop function to remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedData = top.data;
        top = top.nextNode; // Move the top to the next node
        size--;
        return poppedData;
    }

    // Peek function to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Return the size of the stack
    public int size() {
        return size;
    }

    // Display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node tempNode = top;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.nextNode;
        }
        System.out.println();
    }

    // Main method to test the stack
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display(); // Output: 40 30 20 10

        System.out.println("Top element is " + stack.peek()); // Output: 40

        System.out.println("Popped element: " + stack.pop()); // Output: 40
        stack.display(); // Output: 30 20 10

        System.out.println("Stack size: " + stack.size()); // Output: 3
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}
