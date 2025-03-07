class Solution {
    int count=0;
    private void func(int[] nums,int idx,int k,HashMap<Integer,Integer>mp){
        if(idx>=nums.length){
            count++;
            return;
        }

        if(!mp.containsKey(nums[idx]-k) && !mp.containsKey(nums[idx]+k)){
            mp.put(nums[idx],mp.getOrDefault(nums[idx],0)+1);
            func(nums,idx+1,k,mp);
            mp.put(nums[idx],mp.get(nums[idx])-1);
            if(mp.get(nums[idx])==0){
                mp.remove(nums[idx]);
            }
        }

        func(nums,idx+1,k,mp);
    }
    public int beautifulSubsets(int[] nums, int k) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        func(nums,0,k,mp);
        return count-1; // exclude empty subset
    }
}