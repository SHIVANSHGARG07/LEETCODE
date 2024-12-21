class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String result = "";
        
        for (String word : dictionary) {
            if (canForm(s, word)) {
                // Check if the word is longer or lexicographically smaller
                if (word.length() > result.length() || 
                    (word.length() == result.length() && word.compareTo(result) < 0)) {
                    result = word;
                }
            }
        }
        
        return result;
    }

    // Helper function to check if a word can be formed from s
    private boolean canForm(String s, String word) {
        int i = 0; // Pointer for string s
        int j = 0; // Pointer for word
        
        while (i < s.length() && j < word.length()) {
            if (s.charAt(i) == word.charAt(j)) {
                j++; // Move pointer in word if there's a match
            }
            i++; // Always move pointer in s
        }
        
        return j == word.length(); // If we have matched all characters in word
    }
    
}