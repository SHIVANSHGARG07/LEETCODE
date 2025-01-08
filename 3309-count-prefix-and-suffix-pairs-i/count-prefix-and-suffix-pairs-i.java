class Solution {
    public boolean isPrefixAndSuffix(String a,String b){
    return b.startsWith(a) && b.endsWith(a);
    }
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(isPrefixAndSuffix(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }
}