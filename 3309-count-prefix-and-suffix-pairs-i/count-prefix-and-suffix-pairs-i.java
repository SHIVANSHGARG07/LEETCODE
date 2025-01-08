class Solution {
    public boolean isPrefixAndSuffix(String a,String b){
    int m = a.length();
    int n = b.length();
    if(m>n) return false;
    boolean ans1=false;
    boolean ans2=false;

    if(b.indexOf(a)==0){
        ans1=true;
    }
    int index = n-m;
    if(b.substring(index).equals(a)){
        ans2=true;
    }
    return ans1 && ans2;
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