package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    // Method to group anagrams
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Convert string to char array
            char[] ca = s.toCharArray();

            // Sort the char array
            Arrays.sort(ca);

            // Convert sorted char array back to string
            String keyStr = String.valueOf(ca);

            // Check if the sorted string is already in the map
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }

            // Add the original string to the list corresponding to the sorted key
            map.get(keyStr).add(s);
        }

        // Return all the grouped anagrams
        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {
        // Create an instance of GroupAnagrams
        GroupAnagrams ga = new GroupAnagrams();

        // Test case
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Call the groupAnagrams method and get the result
        List<List<String>> result = ga.groupAnagrams(strs);

        // Print the grouped anagrams
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
