package hashing;
import java.util.*;

public class Union {
public static int union(int arr1[],int arr2[]) {
	HashSet<Integer> set=new HashSet<Integer>();
	for (int i = 0; i < arr1.length; i++) {
		set.add(arr1[i]);
	}
	for (int i = 0; i < arr2.length; i++) {
		set.add(arr2[i]);
	}
	return set.size();
}
public static void main(String[] args) {
	int arr1[]= {7,3,6,4};
	int arr2[]= {4,5,3,6,9,1};
	System.out.println(union(arr1,arr2));
	
}
}

