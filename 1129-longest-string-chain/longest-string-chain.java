class Solution{
    public boolean check(String a,String b){
        int m = a.length();
        int n = b.length();
        int i=0,j=0;
        if(n-m!=1) return false;

        while(i<m && j<n){
            if(a.charAt(i)==b.charAt(j)){
                i++;
            }
            j++;
        }
        return i==m;
    }
    public int longestStrChain(String[] words) {
        int n = words.length;
       Arrays.sort(words,(a,b)->Integer.compare(a.length(),b.length()));

        int[] dp = new int[n];
        Arrays.fill(dp,1);

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(check(words[j],words[i])){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int maxy=0;
        for(int num:dp){
            maxy = Math.max(maxy,num);
        }

        return maxy;
    }
}