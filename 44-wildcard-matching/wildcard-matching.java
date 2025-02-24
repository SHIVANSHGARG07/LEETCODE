import java.util.*;

class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        int[][] dp = new int[m+1][n+1];

        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        return memo(s, p, m, n, dp);
    }

    private boolean memo(String s, String p, int m, int n, int[][] dp) {
        // If both strings are empty, it's a match
        if (m == 0 && n == 0) return true;

        // If pattern is empty but string is not, return false
        if (n == 0) return false;

        // If string is empty, pattern must contain only '*' to match
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                if (p.charAt(i) != '*') return false;
            }
            return true;
        }

        if (dp[m][n] != -1) return dp[m][n] == 1;

        boolean ans = false;

        // If last characters match OR '?' is found
        if (s.charAt(m - 1) == p.charAt(n - 1) || p.charAt(n - 1) == '?') {
            ans = memo(s, p, m - 1, n - 1, dp);
        }

        // If '*' is found, check both possibilities
        else if (p.charAt(n - 1) == '*') {
            ans = memo(s, p, m - 1, n, dp) || memo(s, p, m, n - 1, dp);
        }

        dp[m][n] = ans ? 1 : 0;
        return ans;
    }
}
