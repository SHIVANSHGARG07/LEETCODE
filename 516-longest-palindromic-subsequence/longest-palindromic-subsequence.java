class Solution {
    public int memo(String s,int i,int j,int[][] dp){
        if(i==j) return 1;
        if(i>j) return 0; // crosees limits 
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j] = 2+memo(s,i+1,j-1,dp);
        }
        else{
            dp[i][j]=Math.max(memo(s,i+1,j,dp),memo(s,i,j-1,dp));
        }
        return dp[i][j];
    }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        // make dp 
        int[][] dp = new int[1001][1001];

        for(int i=0;i<1001;i++){
            Arrays.fill(dp[i],-1);
        }

        return memo(s,0,n-1,dp);
    }
}