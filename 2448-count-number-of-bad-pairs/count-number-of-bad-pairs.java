class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>mp = new HashMap<>();
        long total = (long)n*(n-1)/2;

        long count=0;
        for(int i=0;i<n;i++){
            int num = nums[i]-i;
            if(mp.containsKey(num)){
                count+=mp.get(num);
            }
            mp.put(num,mp.getOrDefault(num,0)+1);
            
        }

        return total-count;
    }
}