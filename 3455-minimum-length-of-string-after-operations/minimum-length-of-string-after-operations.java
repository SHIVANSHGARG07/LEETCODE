class Solution {
    public int minimumLength(String s) {
        int[] fq = new int[26];
        for(char c:s.toCharArray()){
            fq[c-'a']++;
        }
        int ans=0;

        for(int i=0;i<26;i++){
            int count = fq[i];

            if(count>2){
            while(count>2){
                count-=2;
            }
            ans+=count;
            }

            else{
                ans+=count;
            }
        }
        return ans;
    }
}