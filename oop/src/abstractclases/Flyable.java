package abstractclases;

public interface Flyable {
	void fly();

}
abstract class Bird implements Flyable{
	abstract void sound();
	
    void sleep() {
    	System.out.println("this brid sleeps.");
    }
}
class Sparrow extends Bird{
	@Override
	void sound() {
		System.out.println("Sparrow says: Chrip Chrip");
	}
	@Override
	public void fly() {
		System.out.println("sparrow is flying");
	}
}

