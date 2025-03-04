class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return memo(n,dp);
    }
    private int memo(int n,int[] dp){
        if(n==0) return 0;
        if(dp[n]!=-1){
            return dp[n];
        }

        int ans = Integer.MAX_VALUE;

        for(int i=1;i*i<=n;i++){
            int sq = i*i;
            ans = Math.min(ans,1+memo(n-sq,dp));
        }
         dp[n]=ans;
         return dp[n];
    }
}