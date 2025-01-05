package exception;


public class ExceptionPropagationExample {
	public static void main(String[] args) {
		try {
			method1();
		} catch (ArithmeticException e) {
			System.out.println("Exception caught in main: "+e.getMessage());
		}
	}
public static void method1() {
	method2();
	
}
public static void method2() {
	int result=10/0;
}
}
