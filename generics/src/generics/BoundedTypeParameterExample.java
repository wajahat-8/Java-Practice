package generics;

import java.util.List;

class ListUtils{
	public static <T extends Comparable<T>> T findMax(List<T> list) {
		T max=list.get(0);
		for (T item: list) {
			if (item.compareTo(max)>0) {
				max=item;
			}
		}
		return max;
	}
}
public class BoundedTypeParameterExample {
public static void main(String[] args) {
	 List<Integer> numbers = List.of(3, 5, 17, 2, 8);
     System.out.println("Max: " + ListUtils.findMax(numbers));

     List<String> names = List.of("Alice", "Bob", "Charlie");
     System.out.println("Max: " + ListUtils.findMax(names));
}
}
