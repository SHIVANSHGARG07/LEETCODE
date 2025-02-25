class Solution {
    public int bestClosingTime(String s) {
        int n = s.length();
       int[] pre = new int[n+1];  // count n 
       int[] suff = new int[n+1];  // count y

       for(int i=0;i<n;i++){
        pre[i+1] = pre[i]+ (s.charAt(i)=='N'?1:0);
       }

       for(int i=n-1;i>=0;i--){
        suff[i] = suff[i+1]+(s.charAt(i)=='Y'?1:0);
       }
       
      int miny = Integer.MAX_VALUE;
      int ans=0;

       for(int i=0;i<=n;i++){
        int sum = pre[i]+suff[i];
        if(sum<miny){
            miny = sum;
            ans =i;
        }
       }
       return ans;
   }
}