package interfacee;

public class TestFuctionalInterface {
	public static void main(String[] args) {
		Calculator addition=(a,b)->a+b;
		Calculator subtraction=(a,b)->a-b;
		System.out.println("Addition "+addition.operate(10, 25));
		System.out.println("Subtraction "+subtraction.operate(25, 10));
		
	}

}
