package stack;

import java.util.Stack;

public class NextGreaterElement {
	public static int[] nextGreater(int[] arr) {
		int n=arr.length;
		int[] result=new int[n];
		Stack<Integer> stack =new Stack<>();
		for (int i = n-1;  i>=0; i--) {
			while(!stack.isEmpty()&&stack.peek()<=arr[i]) {
				stack.pop();	
			}
			result[i]=stack.isEmpty()?-1:stack.peek();
			stack.push(arr[i]);
			
		}
		return result;
		
	}
	 public static void main(String[] args) {
	        int[] arr = {4, 5, 2, 25};
	        int[] result = nextGreater(arr);
	        for (int val : result) {
	            System.out.print(val + " ");
	        }
	    }
}
