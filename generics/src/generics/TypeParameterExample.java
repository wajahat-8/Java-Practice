package generics;
class Triple<X,Y,Z>{
	private X first;
	private Y second;
	private Z third;
	public Triple(X first,Y second,Z third) {
		this.first=first;
		this.second=second;
		this.third=third;
	}
	public void printTriple() {
		System.out.println("First: "+first+", second"+second+",Third"+third);
	}
}
public class TypeParameterExample {
public static void main(String[] args) {
	Triple<String,Integer,Double> data=new Triple("wajahat", 25, 7899);
	data.printTriple();
}
}
