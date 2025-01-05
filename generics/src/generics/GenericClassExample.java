package generics;
class GenercContainer<T,U>{
	private T first;
	private U second;
	public GenercContainer(T first,U second) {
		this.first=first;
		this.second=second;
	}
	public T getFirst() {
		return first;
	}
	public U getScond() {
		return second;
	}
	public void printDetails() {
		System.out.println("First: "+first+", second: "+second);
	}
}
public class GenericClassExample {
public static void main(String[] args) {
	GenercContainer<String,Integer> student=new GenercContainer("Alice",90);
	student.printDetails();
	
	
}
}
