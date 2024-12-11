package trickyProblems;

public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // The expected length should be n+1
        int expectedSum = (n * (n + 1)) / 2; // Sum of numbers from 1 to n
        int actualSum = 0;

        // Calculate the sum of the elements in the array
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between expected sum and actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example array with a missing number
        System.out.println("The missing number is: " + findMissingNumber(arr)); // Output will be 3
    }
}
