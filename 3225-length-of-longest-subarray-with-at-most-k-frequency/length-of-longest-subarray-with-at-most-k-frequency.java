class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0,j=0;
        int n = nums.length;
        HashMap<Integer,Integer>mp = new HashMap<>();
        int maxy = Integer.MIN_VALUE;

        while(j<n){
            int num = nums[j];
         mp.put(num,mp.getOrDefault(num,0)+1);

         while(mp.get(num)>k){
            mp.put(nums[i],mp.get(nums[i])-1);

            if(mp.get(nums[i])==0){
                mp.remove(nums[i]);
            }
            i++;
         }

         maxy = Math.max(maxy,j-i+1);
         j++;
        }
        return maxy;
    }
}