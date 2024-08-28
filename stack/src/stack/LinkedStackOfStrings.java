package stack;



public class LinkedStackOfStrings {
	private Node first=null;
	private class Node{
		String item;
		 Node nextNode;
	}
	public boolean isEmpty() {
		return first==null;
	}
	public void push(String item) {
		Node oldFirst=first;
		first=new Node();
		first.item=item;
		first.nextNode=oldFirst;
		
	}
	public String pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack underflow");
			
		}
		String item=first.item;
		first=first.nextNode;
		return item;
		
	}
	public String peek() {
		if (isEmpty()) {
			throw new RuntimeException("stack underflow");
			
		}
		return first.item;
		
		
	}
	 public static void main(String[] args) {
	        LinkedStackOfStrings stack = new LinkedStackOfStrings();
	        stack.push("Hello");
	        stack.push("World");
	        
	        System.out.println("Top item: " + stack.peek()); 
	        System.out.println("Popped item: " + stack.pop()); 
	        System.out.println("Is stack empty? " + stack.isEmpty()); 
	        
	        stack.push("Java");
	        System.out.println("Top item: " + stack.peek()); 
	        System.out.println("Popped item: " + stack.pop()); 
	        System.out.println("Popped item: " + stack.pop()); 
	        
	        System.out.println("Is stack empty? " + stack.isEmpty()); 
	    }
	

}
