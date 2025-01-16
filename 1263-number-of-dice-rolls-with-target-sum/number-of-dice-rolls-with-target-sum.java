class Solution {
        int mod = 1000000007;

    public int numRollsToTarget(int n, int m, int k) {
        int[][] dp = new int[n+1][k+1];

        dp[0][0]=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                for(int x=1;x<=m;x++){
                    if(j-x>=0){
                    dp[i][j]=( dp[i][j]+dp[i-1][j-x] )%mod;
                    }
                }
            }
        }
        return dp[n][k];

    }
}