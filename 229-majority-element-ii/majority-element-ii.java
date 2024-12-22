class Solution {
    public List<Integer> majorityElement(int[] nums) {
       HashMap<Integer,Integer>mp = new HashMap<>();
       for(int num:nums){
        mp.put(num,mp.getOrDefault(num,0)+1);
       } 
       int n = nums.length;
       List<Integer>ans = new ArrayList<>();
       for(int num:mp.keySet()){
        if(mp.get(num)>n/3){
            ans.add(num);
        }
       }
       return ans;
    }
}