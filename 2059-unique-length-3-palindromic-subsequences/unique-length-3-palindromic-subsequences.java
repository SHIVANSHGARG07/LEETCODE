class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        int [] second = new int[26];
        Arrays.fill(first,-1);
        Arrays.fill(second,-1);

        int n = s.length();

        for(int i=0;i<n;i++){
            int ch=s.charAt(i)-'a';
            if(first[ch]==-1){
                first[ch]=i;
            }
            second[ch]=i;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(first[i]==-1) continue;
            HashSet<Character>st = new HashSet<>();
            for(int idx = first[i]+1;idx<second[i];idx++){
                st.add(s.charAt(idx));
            }
            count+=st.size();
        }
        return count;
    }
}