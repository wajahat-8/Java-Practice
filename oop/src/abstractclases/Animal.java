package abstractclases;


abstract class Animal {
	abstract void sound();
	 void sleep() {
		System.out.println("this animal sleeps");
	}

}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Dog says: Woof Woov");
	}
}
