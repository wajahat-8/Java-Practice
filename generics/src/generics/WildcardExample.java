package generics;

import java.util.List;

class ListPrinter{
	public static void printList(List<?> list) {
		for(Object item:list) {
			System.out.print(item+" ");
		}
		System.out.println();
	}
	public static void printNumbers(List<? extends Number> list) {
		double sum=0;
		for(Number num:list) {
			sum+=num.doubleValue();
			System.out.print(num + " ");
		}
		System.out.println(" | sum: "+sum);
	}
}
public class WildcardExample {
public static void main(String[] args) {
	List<String> strings=List.of("A","B","C");
	List<Integer> numbers=List.of(1,2,3,4);

    ListPrinter.printList(strings);
    ListPrinter.printList(numbers);
    ListPrinter.printNumbers(numbers);
    
}
}
