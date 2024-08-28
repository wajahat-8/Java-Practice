package recursion;


public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        for (int i = 0; i <= n; i++) {
            int result = fib(i);
            System.out.print(result + " ");
        }
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

