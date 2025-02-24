class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        
        // Step 1: Transform the string
        String t = preprocess(s);
        int n = t.length();
        int[] P = new int[n]; // Array to store palindrome radius
        int C = 0, R = 0; // Center and right boundary of the current palindrome
        int maxLen = 0, centerIndex = 0;

        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * C - i; // Mirror of i with respect to C

            if (i < R) {
                P[i] = Math.min(R - i, P[mirror]);
            }

            // Try expanding around center i
            while (t.charAt(i + P[i] + 1) == t.charAt(i - P[i] - 1)) {
                P[i]++;
            }

            // Update center and right boundary if expanded beyond R
            if (i + P[i] > R) {
                C = i;
                R = i + P[i];
            }

            // Update max palindrome length
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }

        // Step 3: Extract the original palindrome substring
        int start = (centerIndex - maxLen) / 2; // Adjust back to original index
        return s.substring(start, start + maxLen);
    }
    private String preprocess(String s) {
        StringBuilder sb = new StringBuilder("^");
        for (char c : s.toCharArray()) {
            sb.append("#").append(c);
        }
        sb.append("#$");
        return sb.toString();
    }
}