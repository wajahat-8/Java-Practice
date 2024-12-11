package trickyProblems;

import java.util.HashMap;
import java.util.Map;

public class FindTwoUniqueNumbers {
    public static int[] findUniqueNumbers(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int[] uniqueNumbers = new int[2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumbers[index++] = entry.getKey();
                if (index == 2) {
                    break;
                }
            }
        }
        return uniqueNumbers;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 4, 6}; // Only 2 and 8 are unique
        int[] result = findUniqueNumbers(nums);
        System.out.println("Unique Numbers: " + result[0] + ", " + result[1]);
    }
}

