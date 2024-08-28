package generics;

public class FixedCapacityStack<Item> {
	private Item[] s;
	private int N=0;
	public FixedCapacityStack(int capacity) {
		s=(Item[]) new Object[capacity];
	}
public boolean isEmpty() {
	return N==0;
}
public boolean isFull() {
	return N==s.length;
}
public void push(Item item) {
	if(isFull()) {
		throw new RuntimeException("Stack overflow");
	}
	s[N++]=item;
}
public Item pop(){
	if(isEmpty()) {
		throw new RuntimeException("Stack underflow");
		
	}
	return s[--N];
}
public Item peek() {
	if(isEmpty()) {
		throw new RuntimeException("Stack underflow");
		
	}
	return s[N-1];
	
}
public void printStack() {
	for(int i=0;i<N;i++) {
		System.out.println(s[i]);
	}
}
// Main method to test the FixedCapacityStack class
public static void main(String[] args) {
    FixedCapacityStack<Integer> fixedStack = new FixedCapacityStack<>(3);
    fixedStack.push(1);
    fixedStack.push(2);
    fixedStack.push(3);

    System.out.println("FixedCapacityStack (array):");
    fixedStack.printStack();

    System.out.println("Popped: " + fixedStack.pop());
    System.out.println("After pop:");
    fixedStack.printStack();
}
}
