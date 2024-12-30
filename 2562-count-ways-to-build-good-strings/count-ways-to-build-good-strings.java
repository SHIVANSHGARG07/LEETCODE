class Solution {
    private int mod = 1000000007;
    private int memo(int length,int low,int high,int zero,int one,int[] dp){
        if(length>high) return 0;
        if(dp[length]!=-1) return dp[length];

        int count=0;

        if(length>=low && length<=high) count++;
        count+=memo(length+zero,low,high,zero,one,dp);
        count%=mod;
        count+=memo(length+one,low,high,zero,one,dp);
        count%=mod;

        return dp[length]=count%mod;
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high+1];
        Arrays.fill(dp,-1);
        return memo(0,low,high,zero,one,dp);

    }
}