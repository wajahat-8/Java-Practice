package hashing;
import java.util.HashMap;

public class Sumofarray{
    public static void main(String[] args) {
        // Define the array and the target sum 'k'
        int[] array = {30, 2, -28, 30};
        int targetSum = 2;

        // Create a HashMap to store cumulative sums and their frequencies
        HashMap<Integer, Integer> sumFrequencyMap = new HashMap<>();
        sumFrequencyMap.put(0, 1);  // Initialize with sum 0 occurring once

        int countSubarrays = 0;  // This will store the number of subarrays that sum to targetSum
        int cumulativeSum = 0;    // This tracks the cumulative sum as we iterate through the array

        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            cumulativeSum += array[i];  // Add the current element to the cumulative sum

            // Check if there's a subarray that ends at index i and sums to targetSum
            int difference = cumulativeSum - targetSum;
            if (sumFrequencyMap.containsKey(difference)) {
                // If the difference exists in the map, it means we have found
                // a subarray that sums to the target value
                countSubarrays += sumFrequencyMap.get(difference);  // Increment the count by the frequency of this difference
            }

            // Update the frequency of the current cumulative sum in the map
            sumFrequencyMap.put(cumulativeSum, sumFrequencyMap.getOrDefault(cumulativeSum, 0) + 1);
        }

        // Print the total number of subarrays that sum to the target value
        System.out.println(countSubarrays);
    }
}
