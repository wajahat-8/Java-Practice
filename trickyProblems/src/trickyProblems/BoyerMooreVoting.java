package trickyProblems;

public class BoyerMooreVoting {
    public static int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        // Step 1: Finding the potential majority candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Verifying the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return count > nums.length / 2 ? candidate : -1;  // Return -1 if no majority element exists
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int[] nums3 = {1, 2, 3, 4, 5}; // No majority element

        System.out.println("Majority Element (Test 1): " + majorityElement(nums1)); // Output: 4
        System.out.println("Majority Element (Test 2): " + majorityElement(nums2)); // Output: 2
        System.out.println("Majority Element (Test 3): " + majorityElement(nums3)); // Output: -1
    }
}
