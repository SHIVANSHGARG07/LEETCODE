class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer,Integer>mp = new HashMap<>();
        mp.put(0,-1);
        int sum =0;
        int n = nums.length;


        for(int i=0;i<n;i++){
        sum+=nums[i];
        if(mp.containsKey(sum%k)){
            if(i-mp.get(sum%k)>=2){
                return true;
            }
        }
        else{
        mp.put(sum%k,i);
        }
        }
        return false;
    }
}