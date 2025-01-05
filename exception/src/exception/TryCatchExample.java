package exception;

public class TryCatchExample {
	public static void main(String[] args) {
		try {
			int result=10/0;
		} catch (ArithmeticException e) {
			System.out.println("can not divide by Zero: " + e.getMessage());
		}
		System.out.println("Program continues...");
	}

}
