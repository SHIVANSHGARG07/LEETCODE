class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>st = new HashSet<>();
        int l=0,r=0,n=s.length();
        int maxy =0;
        if(n==0) return 0;

        while(r<n){
           
           while(st.contains(s.charAt(r))){
            st.remove(s.charAt(l));
            l++;
           }

           st.add(s.charAt(r));
           maxy = Math.max(maxy,r-l+1);
           r++;
        }
        return maxy;

    }
}