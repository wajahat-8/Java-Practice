package trickyProblems;

import java.util.Arrays;

public class ProductExpectItself {
    // Method to calculate the product of array except itself
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Step 1: Compute prefix products
        result[0] = 1; // No element to the left of the first element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        // Step 2: Compute postfix products and multiply with prefix
        int postfix = 1; // No element to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= postfix; // Combine prefix and postfix
            postfix *= nums[i]; // Update postfix
        }
        
        return result;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        ProductExpectItself solution = new ProductExpectItself();
        
        // Test case
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        
        // Print the result
        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Product Except Self: " + Arrays.toString(result));
    }
}
