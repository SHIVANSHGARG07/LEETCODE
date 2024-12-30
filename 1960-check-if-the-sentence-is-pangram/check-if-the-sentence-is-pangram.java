class Solution {
    public boolean checkIfPangram(String s) {
        int[] fq = new int[26];
        for(char c:s.toCharArray()){
            fq[c-'a']++;
        }
        for(int num:fq){
            if(num==0){
                return false;
            }
        }
        return true;
    }
}