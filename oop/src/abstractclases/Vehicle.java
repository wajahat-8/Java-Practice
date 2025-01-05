package abstractclases;

abstract class Vehicle {
	String name;
	public Vehicle(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	abstract void start();

}
class Car extends Vehicle{
	
	Car(String name) {
		super(name);
	}
	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println(name + " starts with a key");
	}
}