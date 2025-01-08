class Solution {
    public int singleNumber(int[] nums) {
     HashMap<Integer,Integer>mp = new HashMap<>();
     for(int num:nums){
        mp.put(num,mp.getOrDefault(num,0)+1);
     }
     for(int num:mp.keySet()){
        if(mp.get(num)==1){
            return num;
        }
     }
     return -1;
    }
}