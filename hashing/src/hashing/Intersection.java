package hashing;
import java.util.*;
public class Intersection {
	public static int intersection(int arr1[],int arr2[]) {
		HashSet<Integer> set =new HashSet<Integer>();
		List<Integer> intersectingValuesIntegers=new ArrayList<Integer>();
		int count=0;
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
			
		}
		for (int i = 0; i < arr2.length; i++) {
			if (set.contains(arr2[i])) {
				intersectingValuesIntegers.add(arr2[i]);
				count++;
				set.remove(arr2[i]);
			}
		}
		return count;
	}
public static void main(String[] args) {
	int arr1[]= {7,5,8,1};
	int arr2[]= {6,7,1,4};
	System.out.println(intersection(arr1,arr2));
	
}
}
