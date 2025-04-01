class Solution {
    public long memo(int[][] arr,int i,long[] dp){
    int n = arr.length;

    if(i>=n) return 0;

    if(dp[i]!=-1) return dp[i];

    long take = arr[i][0]+memo(arr,i+arr[i][1]+1,dp);
    long not = 0+memo(arr,i+1,dp);

   return  dp[i]=Math.max(take,not);

    }
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n+1];

        Arrays.fill(dp,-1);
        return memo(questions,0,dp);
    }
}