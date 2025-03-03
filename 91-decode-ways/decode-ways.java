class Solution {
    public int memo(String s,int[] dp,int idx){
        int n = s.length();
        if(idx==n) return 1;
        if(s.charAt(idx)=='0') return 0;
        if(dp[idx]!=-1) return dp[idx];

        int res =memo(s,dp,idx+1);
        if(idx<s.length()-1){
            int temp = Integer.parseInt(s.substring(idx,idx+2));
            if(temp<=26){
                res+=memo(s,dp,idx+2);
            }
        }
        return dp[idx]=res;

    }
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];

        Arrays.fill(dp,-1);
        return memo(s,dp,0);


    }
}