import java.util.*;

class Solution {
    private void backtrack(char[] tiles, int[] count, int length, int[] res) {
        if (length > 0) {
            res[0]++; // Count the valid sequence
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) continue; // Skip exhausted characters

            count[i]--; // Use this character
            backtrack(tiles, count, length + 1, res);
            count[i]++; // Backtrack to restore count
        }
    }

    public int numTilePossibilities(String tiles) {
        char[] tileArray = tiles.toCharArray();
        Arrays.sort(tileArray); // Sort to group duplicates together

        int[] count = new int[26]; // Since 'A'-'Z' are max 26 characters
        for (char c : tileArray) {
            count[c - 'A']++; // Store frequency
        }

        int[] res = new int[1]; // Using array to store result (pass-by-reference)
        backtrack(tileArray, count, 0, res);
        return res[0]; // Return the total count
    }
}
