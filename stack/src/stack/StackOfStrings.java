package stack;
import java.util.LinkedList;
import java.util.Scanner;

public class StackOfStrings {

    // Inner class MyStack
    public static class MyStack {
        private LinkedList<String> stack;

        // Constructor to create an empty stack
        public MyStack() {
            stack = new LinkedList<>();
        }

        // Method to insert a new string onto the stack
        public void push(String item) {
            stack.addFirst(item);
        }

        // Method to remove and return the most recently added string
        public String pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is Empty");
            }
            return stack.removeFirst();
        }

        // Method to check if the stack is empty
        public boolean isEmpty() {
            return stack.isEmpty();
        }

        // Method to return the number of strings on the stack
        public int size() {
            return stack.size();
        }
    }

    // Main method
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter input
        System.out.println("Enter strings to push onto the stack, or '-' to pop from the stack:");

        while (scanner.hasNext()) {
            String s = scanner.next();
            if (s.equals("-")) {
                if (!stack.isEmpty()) {
                    System.out.print(stack.pop() + " ");
                } else {
                    System.out.print("Stack is empty ");
                }
            } else {
                stack.push(s);
            }
        }

        scanner.close();
    }
}

