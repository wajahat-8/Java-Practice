package generics;

import java.util.Iterator;

class ArrayUtils{
	public static<T> void reverse(T[] array) {
		int start=0;
		int end=array.length-1;
		while (start<end) {
			T temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
	}
	public static<T> void printArray(T[] array) {
		for (T element:array) {
			System.out.print(element +" ");
		}
		System.out.println();
	}
}
public class GenericMethodExample {

	public static void main(String[] args) {
		 String[] names = {"Alice", "Bob", "Charlie"};
	        System.out.println("Original String Array:");
	        ArrayUtils.printArray(names);
	        ArrayUtils.reverse(names);
	        ArrayUtils.printArray(names);
		
	        Integer[] numbers = {1, 2, 3, 4, 5};
	        System.out.println("\nOriginal Integer Array:");
	        ArrayUtils.printArray(numbers);
	        ArrayUtils.reverse(numbers);
	        System.out.println("Reversed Integer Array:");
	        ArrayUtils.printArray(numbers);

	        // Reverse and print an array of Doubles
	        Double[] decimals = {1.1, 2.2, 3.3};
	        System.out.println("\nOriginal Double Array:");
	        ArrayUtils.printArray(decimals);
	        ArrayUtils.reverse(decimals);
	        System.out.println("Reversed Double Array:");
	        ArrayUtils.printArray(decimals);

	}

}
