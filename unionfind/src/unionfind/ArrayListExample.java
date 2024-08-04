package unionfind;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		
		arrayList.add(3);
		System.out.println(arrayList);
		int firstElement=arrayList.get(0);
		System.out.println("First Element "+firstElement);
		System.out.println("Array List");
		for(int num : arrayList) {
			System.out.println(num);
		}
		Integer[] array=arrayList.toArray(new Integer[0]);
		System.out.print("Array list Converted to array:" + Arrays.toString(array));
		
	}
	

}
