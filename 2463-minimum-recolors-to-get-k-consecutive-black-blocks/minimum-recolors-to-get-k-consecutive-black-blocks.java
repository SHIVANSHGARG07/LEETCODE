class Solution {
    public int minimumRecolors(String s, int k) {
        int l=0,r=0;
        int n = s.length();
        int  min=Integer.MAX_VALUE;
        int count=0;

        while(r<n){
            if(s.charAt(r)=='W'){
                count++;
            }

            while(r-l+1>k){
                if(s.charAt(l)=='W'){
                    count--;
                }
                l++;
            }
            if(r-l+1==k){
            min = Math.min(min,count);
            }
            r++;
        }
        return min;
    }
}