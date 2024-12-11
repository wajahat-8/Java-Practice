package trickyProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count the frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert map entries to a list and sort by frequency in descending order
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Collect the top k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        TopKFrequent obj = new TopKFrequent();
        
        // Example input
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        // Get top k frequent elements
        int[] result = obj.topKFrequent(nums, k);

        // Print the result
        System.out.print("Top " + k + " frequent elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
