package interfacee;

public interface Flyable {
	void fly();

}
interface Walkable{
	void walk();
}
class Bird implements Flyable,Walkable{
	@Override
	public void fly() {
		System.out.println("Bird is flying.");
	}
	@Override	
	public void walk() {
		System.out.println("Bird is walkiing");
	}
}
