class Solution {
    private int mod = 1000000007;
    public int[][] directions = {{0,-1},{-1,0},{1,0},{0,1}};
    public int memo(int m,int n,int max,int i,int j,int[][][] dp){
        if(i<0 || i>=m || j<0 || j>=n) return 1;
        if(max<=0) return 0;
        if(dp[i][j][max]!=-1) return dp[i][j][max];

        int res =0;

        for(int[] dir:directions){
            int a = i+dir[0];
            int b = j+dir[1];
            res = (res+memo(m,n,max-1,a,b,dp))%mod;
        }
        return dp[i][j][max]=res;
    }
    public int findPaths(int m, int n, int max, int sr, int sc) {
        int[][][] dp = new int[51][51][51];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                for(int k=0;k<=max;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return memo(m,n,max,sr,sc,dp);


    }
}