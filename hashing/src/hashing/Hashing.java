
package hashing;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
	public static void main(String args[]) {
		HashSet<Integer> set =new HashSet<>();
		//Insert
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		//seacrch-contains
//		if(set.contains(1)) {
//			System.out.println("set contains 1");
//			
//		}
//		if(!set.contains(6)) {
//
//			System.out.println("does not  contains ");
//			
//		}cd 
//		set.remove(1);
//		if(!set.contains(1)) {
//			System.out.println("set doesnot contain 1");  
//		}
		System.out.println("size of set is "+ set.size());
		System.out.println("All elements of set "+set);
		//Iterator
		Iterator it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
