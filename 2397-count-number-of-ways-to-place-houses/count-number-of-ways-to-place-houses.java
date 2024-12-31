class Solution {
    public int countHousePlacements(int n) {
        int MOD = 1000000007;
        
        // DP for one side
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 2;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        
        // Result for both sides
        long result = (dp[n] * dp[n]) % MOD;
        return (int) result;
    }
}
