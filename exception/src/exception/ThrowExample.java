package exception;

public class ThrowExample {
	public static void main(String[] args) {
		try {
			validateAge(15);
			
		} catch (IllegalArgumentException e) {
			System.out.println("caught an exception"+e.getMessage());
		}
		
	}
	public static void validateAge(int age) {
		if (age<18) {
			throw new IllegalArgumentException("Age must be 18 or older");
		}
		System.out.println("valid age"+age);
	}

}
