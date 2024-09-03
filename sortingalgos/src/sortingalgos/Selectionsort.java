package sortingalgos;
import java.util.*;

public class Selectionsort{
	public static <T extends Comparable<T>> void sort(T[] array) {
		
		int length=array.length;
		for (int i = 0; i < length; i++) {
			int minIndex=i;
			for (int j = i+1; j < length; j++) {
				if(less(array[j],array[minIndex])) {
					minIndex=j;
				}
			}
			swap(array,i,minIndex);
		}
	}
	
	private static <T extends Comparable<T>> boolean less(T v,T w) {
		return v.compareTo(w) <0;
	}
	public static<T> void swap(T[] array,int i,int j) {
		T temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	   public static void main(String[] args) {
	        Integer[] numbers = {64, 34, 25, 12, 22, 11, 90};
	        Selectionsort.sort(numbers);
	        for (int number : numbers) {
	            System.out.print(number + " ");
	        }
	    }
}
