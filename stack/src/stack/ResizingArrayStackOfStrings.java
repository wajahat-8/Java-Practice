package stack;

public class ResizingArrayStackOfStrings {
    private String[] s;
    private int N = 0;

    // Constructor: Initializes the stack with an initial capacity of 1.
    public ResizingArrayStackOfStrings() {
        s = new String[1];
    }

    // Push: Adds an item to the stack. Resizes the array if necessary.
    public void push(String item) {
        if (N == s.length) resize(2 * s.length);
        s[N++] = item;
    }

    // Resize: Resizes the underlying array to the given capacity.
    private void resize(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; i < N; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }

    // Pop: Removes and returns the most recently added item from the stack.
    public String pop() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        String item = s[--N];
        s[N] = null;  // Avoid loitering
        if (N > 0 && N == s.length / 4) resize(s.length / 2);
        return item;
    }

    // Peek: Returns (but does not remove) the most recently added item from the stack.
    public String peek() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        return s[N - 1];
    }

    // isEmpty: Checks if the stack is empty.
    public boolean isEmpty() {
        return N == 0;
    }

    // Size: Returns the number of items currently in the stack.
    public int size() {
        return N;
    }

    // Print Stack: Helper method to print the current elements in the stack.
    public void printStack() {
        for (int i = 0; i < N; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings();
        stack.push("Hello");
        stack.push("World");
        stack.push("!");
        stack.printStack(); // Prints: Hello World !
        
        System.out.println(stack.pop());  // Prints: !
        System.out.println(stack.peek()); // Prints: World
        
        stack.printStack(); // Prints: Hello World
    }
}
