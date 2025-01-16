class Solution {
    int mod = 1000000007;

    public int numRollsToTarget(int n, int k, int target) {
        // Create the DP table
        int[][] dp = new int[n + 1][target + 1];
        
        // Base case: 1 way to get sum 0 with 0 dice
        dp[0][0] = 1;
        
        // Fill the DP table iteratively
        for (int i = 1; i <= n; i++) { // For each dice
            for (int j = 1; j <= target; j++) { // For each possible sum
                dp[i][j] = 0; // Initialize dp[i][j] to 0
                // Try each face value (1 to k)
                for (int face = 1; face <= k; face++) {
                    if (j - face >= 0) { // Check if previous sum is valid
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - face]) % mod;
                    }
                }
            }
        }

        // Return the number of ways to get the target sum using n dice
        return dp[n][target];
    }
}
