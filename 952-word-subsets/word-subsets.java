class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String>ans = new ArrayList<>();
        int[] fq1 = new int[26];

        for(String word:words2){
            int[]fq2 = func(word);
            for(int i=0;i<26;i++){
                fq1[i] = Math.max(fq1[i],fq2[i]);
            }
        }

        for(String a:words1){
            int[] fq3 = func(a);
            if(universal(fq3,fq1)){
                ans.add(a);
            }
        }
        return ans;
    }
    private int[] func(String str){
        int[] fq = new int[26];
        for(char c:str.toCharArray()){
            fq[c-'a']++;
        }
        return fq;
    }

    private boolean universal(int[] fq3,int[] fq1){
        for(int i=0;i<26;i++){
            if(fq3[i]<fq1[i]){
                return false;
            }
        }
        return true;
    }
    
}