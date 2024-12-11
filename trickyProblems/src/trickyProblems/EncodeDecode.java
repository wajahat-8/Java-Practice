package trickyProblems;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {

    // Encodes a list of strings to a single string
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    // Decodes a single string to a list of strings
    public List<String> decode(String str) {
        List<String> reStrings = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            // Find the separator '#'
            while (str.charAt(j) != '#') {
                j++;
            }
            // Extract the length of the next string
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1; // Move past '#'
            // Extract the string of the specified length
            j = i + length;
            reStrings.add(str.substring(i, j));
            i = j; // Move to the next part of the string
        }
        return reStrings;
    }

    public static void main(String[] args) {
        EncodeDecode codec = new EncodeDecode();

        // Example list of strings
        List<String> strs = new ArrayList<>();
        strs.add("hello");
        strs.add("world");
        strs.add("java");
        strs.add("programming");

        // Encoding
        String encodedString = codec.encode(strs);
        System.out.println("Encoded String: " + encodedString);

        // Decoding
        List<String> decodedList = codec.decode(encodedString);
        System.out.println("Decoded List: " + decodedList);
    }
}
