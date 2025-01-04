class Solution {
    public int func(String s,int k,char c){
        int l=0,count=0,maxy=0;
        int r=0;
        int n = s.length();

        while(r<n){
            if(s.charAt(r)!=c){
                count++;
            }
            while(count>k){
                if(s.charAt(l)!=c){
                    count--;
                }
                l++;
            }
            maxy = Math.max(maxy,r-l+1);
            r++;
        }
        return maxy;
    }
    public int maxConsecutiveAnswers(String s, int k) {
        return Math.max(func(s,k,'T'),func(s,k,'F'));
    }
}