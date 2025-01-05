package interfacee;

public interface Animal {
	void sound();
	default void sleep() {
		System.out.println("This animal sleeps.");
	}
	static void info() {
		System.out.println("Animals are facinating ceatures.");
	}

}
class Cat implements Animal{
	public void sound() {
		System.out.println("Cat says:Meow");
	}
}
