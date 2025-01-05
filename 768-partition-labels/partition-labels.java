class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] fq = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
         char ch = s.charAt(i);
         fq[ch-'a']=i;
        }

        int start =0,end=0;
        List<Integer>ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            end = Math.max(end,fq[s.charAt(i)-'a']);

            if(i==end){
                ans.add(end-start+1);
            start=i+1;
            }
        }
        return ans;
    }
}