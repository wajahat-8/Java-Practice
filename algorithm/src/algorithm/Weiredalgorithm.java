package algorithm;

import java.util.Scanner;

public class Weiredalgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(); // Using long for larger values
        scanner.close();

        while (n != 1) {
            System.out.print(n + " "); // Print the current value
            if (n % 2 == 0) {
                n /= 2; // If even, divide by 2
            } else {
                n = n * 3 + 1; // If odd, multiply by 3 and add 1
            }
        }
        System.out.println(1); // Print the final 1
    }
}
