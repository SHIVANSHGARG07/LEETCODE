class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n =values.length;

        int[] dp = new int[n];
        dp[0]=values[0];

        for(int i=1;i<n;i++){
            dp[i]=Math.max(dp[i-1],values[i]+i);
        }
        for(int num:dp){
            System.out.print(num+" ");
        }
       int maxy = Integer.MIN_VALUE;

        for(int j=1;j<n;j++){
          maxy = Math.max(maxy,values[j]-j+dp[j-1]);
        }
        return maxy;

        
    }
}