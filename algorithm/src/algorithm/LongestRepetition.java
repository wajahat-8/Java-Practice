package algorithm;

import java.util.Scanner;

public class LongestRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dna = scanner.nextLine().trim();

        if (dna.isEmpty()) {
            System.out.println(0);
            return;
        }

        int maxLen = 1;
        int currentLen = 1;

        for (int i = 1; i < dna.length(); i++) {
            if (dna.charAt(i) == dna.charAt(i - 1)) {
                currentLen++;
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                }
            } else {
                currentLen = 1;
            }
        }

        System.out.println(maxLen);
    }
}
