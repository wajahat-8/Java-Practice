package unionfind;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class collectionUtilityExample {

    public static void main(String[] args) {
	ArrayList<Integer> numberList=new ArrayList<>(Arrays.asList(3,1,2));
	 Collections.sort(numberList);
	System.out.println("Sorted ArrayList: " + numberList);
	int index=Collections.binarySearch(numberList, 2);
    System.out.println("Index of element '2' in sorted ArrayList: " + index);
	
	int min=Collections.min(numberList);
	int max=Collections.max(numberList);
	 System.out.println("Min element in ArrayList: " + min);
     System.out.println("Max element in ArrayList: " + max);
	
	
    }

}
