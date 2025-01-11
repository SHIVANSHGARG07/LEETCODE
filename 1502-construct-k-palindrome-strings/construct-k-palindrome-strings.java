class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        if(n<k) return false;
        if(n==k) return true;
        HashMap<Character,Integer>mp = new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

    int count=0;
    for(int num:mp.values()){
        if(num%2==1){
            count++;
        }
    }
    return count>k?false:true;
    }
}