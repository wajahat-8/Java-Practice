package recursion;

public class Main {
	public static int factorial(int n) {
		if(n==0) return 1;
		else return n*factorial(n-1);
	}
	public static void main(String[] args) {
		int number=5;
		int result=factorial(5);
		System.out.println("factorial of  "+number+" is "+result);
	}

}
