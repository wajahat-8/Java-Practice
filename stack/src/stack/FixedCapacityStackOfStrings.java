package stack;

public class FixedCapacityStackOfStrings {
	private String[] s;
	private int N=0;
	public FixedCapacityStackOfStrings(int capacity) {
		s=new String[capacity];
	}
	public boolean isEmpty() {
		return N==0;
	}
	public void push(String item) {
		if(N==s.length) {
			throw new RuntimeException("stack overflow");
		}
		s[N++]=item;
	}
	public String pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack underflow");
			
		}
		String item=s[--N];
		s[N]=null;
		return item;
	}
	public String peek() {
		if (isEmpty()) {
			throw new RuntimeException("stack underflow");
			
		}
		return s[N-1];
	}
	 public static void main(String[] args) {
	        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(5);
	        stack.push("Hello");
	        stack.push("World");
	        
	        System.out.println("Top item: " + stack.peek()); 
	        System.out.println("Popped item: " + stack.pop()); 
	        System.out.println("Is stack empty? " + stack.isEmpty()); 
	        
	        stack.push("Java");
	        stack.push("Kotlin");
	        
	        System.out.println("Top item: " + stack.peek()); 
	        System.out.println("Popped item: " + stack.pop()); 
	        System.out.println("Popped item: " + stack.pop()); 
	        
	        System.out.println("Is stack empty? " + stack.isEmpty()); 
	        
	        stack.push("Scala");
	        stack.push("Python");
	        stack.push("Ruby");
	        stack.push("JavaScript"); 
	        
	        System.out.println("Top item: " + stack.peek()); 
	    }

}
