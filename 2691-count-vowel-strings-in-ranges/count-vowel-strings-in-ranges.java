class Solution {
    public boolean check(Character c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    public boolean func(String s){
        return check(s.charAt(0)) && check(s.charAt(s.length()-1));
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int m = queries.length;
        int[] prefix = new int[n];
        prefix[0] = func(words[0])?1:0;

        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+(func(words[i])?1:0);
        }
        int[] ans = new int[m];

        for(int i=0;i<m;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            ans[i]=left==0?prefix[right]:prefix[right]-prefix[left-1];
        }
        
        return ans;
    }
}