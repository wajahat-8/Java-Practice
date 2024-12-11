package stack;

public class CustomStack {
	private int[] stackArray;
	private int top;
	private int capacity;
	public CustomStack(int capacity) {
		this.capacity=capacity;
		stackArray=new int[capacity];
		top=-1;
	}
	public void push(int value) {
		if(top==capacity-1) {
			System.out.println("stack is full");
		}else {
			stackArray[++top]=value;
			System.out.println("pushed "+ value);
		}
	}
	public int pop() {
		if(top==-1) {
			System.out.println("stack is empty");
			return -1;
		}
		else {
			return stackArray[top--];
		}
		
	}
	public int peek() {
		if(top==-1) {
			System.out.println("stack is empty");
			return -1;
		}
		else {
			return stackArray[top];
		}
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public int size() {
		return top+1;
	}
	   public static void main(String[] args) {
	        CustomStack stack = new CustomStack(5);
	        
	        stack.push(10);
	        stack.push(20);
	        System.out.println("Top element: " + stack.peek());
	        System.out.println("Popped element: " + stack.pop());
	        System.out.println("Is stack empty? " + stack.isEmpty());
	        System.out.println("Stack size: " + stack.size());
	    }

}
