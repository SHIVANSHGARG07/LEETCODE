class Solution {
    private int memo(String s,int idx,int prev,int k,Integer[][] dp){
        if(idx>=s.length()) return 0;

        if(dp[idx][prev]!=null) return dp[idx][prev];



        int skip = memo(s,idx+1,prev,k,dp);

        int maxy =0;

        char ch = s.charAt(idx);

        if(prev==0 || Math.abs((prev-1)-(ch-'a'))<=k){
            maxy = Math.max(maxy,1+memo(s,idx+1,ch-'a'+1,k,dp));
        }

        return dp[idx][prev]=Math.max(skip,maxy);
    }
    public int longestIdealString(String s, int k) {
        int n = s.length();
        Integer[][] dp =  new Integer[n][27];  // 1 extra for skip

        // like first is 0 so call it as prev 
        // at prev we add value 
        // or if valid then add value
        // 1 case is of skip
        // if idx>=n return 0;

        return memo(s,0,0,k,dp);


    }
}