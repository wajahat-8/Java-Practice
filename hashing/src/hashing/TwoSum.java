package hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Function to find two indices that sum up to the target
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the value and its corresponding index
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement needed to reach the target

            // If the complement exists in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // Found the pair
            }

            // Store the current number and its index in the map
            map.put(nums[i], i);
        }

        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // Example array and target
        int[] nums = {2, 7, 11, 1};
        int target = 3;

        // Create an instance of TwoSum
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
      
        // Print the result
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}

