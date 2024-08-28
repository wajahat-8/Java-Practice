package generics;

public class Stack<Item> {
 private class Node{
	 Item item;
	 Node nextNode;
 }
 private Node first=null;
 public boolean isEmpty() {
	 return first==null;
 }
 public void push(Item item) {
	 Node oldfirstNode=first;
	 first=new Node();
	 first.item=item;
	 first.nextNode=oldfirstNode;
	 }
 public Item pop() {
	 if(isEmpty()) {
		 throw new RuntimeException("stack underflow");
	 }
	 Item item=first.item;
	 first=first.nextNode;
	 return item;
 }
 public Item peek() {
	 if(isEmpty()) {
		 throw new RuntimeException("Stack underflow");
	 }
	 return first.item;
 }
 public void printStack() {
	 Node current=first;
	 while(current!=null) {
		 System.out.println(current.item);
		 current=current.nextNode;
	 }
 }
 public static void main(String[] args) {
     Stack<String> stack = new Stack<>();
     stack.push("Hello");
     stack.push("World");
     stack.push("!");

     System.out.println("Stack (linked list):");
     stack.printStack();

     System.out.println("Popped: " + stack.pop());
     System.out.println("After pop:");
     stack.printStack();
 }
}
