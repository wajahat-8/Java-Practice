package trickyProblems;
import java.util.ArrayList; // Importing ArrayList for creating lists dynamically.
import java.util.Arrays;   // Importing Arrays for array utilities like sorting.
import java.util.HashMap;  // Importing HashMap to store groups of anagrams.
import java.util.List;     // Importing List interface for handling lists.
import java.util.Map;      // Importing Map interface for key-value pair collections.


public class GroupAnagrams {
    // Method to group anagrams from an array of strings.
    public List<List<String>> groupAnagrams(String[] strs) {
        // Initialize a HashMap to group strings by their sorted character representation.
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Iterate through each string in the input array.
        for (String str : strs) {
            // Convert the string to a character array.
            char[] chars = str.toCharArray();

            // Sort the character array to form a "canonical" representation of the string.
            Arrays.sort(chars);

            // Convert the sorted character array back into a string.
            String sortedString = new String(chars);

            // If the sorted string is not already a key in the map, add it.
            if (!anagramMap.containsKey(sortedString)) {
                anagramMap.put(sortedString, new ArrayList<String>());
            }

            // Add the original string to the list corresponding to the sorted string.
            anagramMap.get(sortedString).add(str);
        }

        // Return the grouped anagrams as a list of lists.
        return new ArrayList<>(anagramMap.values());
    }

    // Main method to test the GroupAnagrams class.
    public static void main(String[] args) {
        // Instantiate the GroupAnagrams class.
        GroupAnagrams groupAnagrams = new GroupAnagrams();

        // Input array of strings.
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Call the groupAnagrams method and store the result.
        List<List<String>> groupedAnagrams = groupAnagrams.groupAnagrams(strs);

        // Print the grouped anagrams.
        System.out.println("Grouped Anagrams:");
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}
