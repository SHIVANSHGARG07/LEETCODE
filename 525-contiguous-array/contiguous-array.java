class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        mp.put(0,-1);
        int n=nums.length;
        int sum=0;
        int maxy=0;

        for(int i=0;i<n;i++){
            sum+=(nums[i]==1?1:-1);
            if(mp.containsKey(sum)){
                maxy=Math.max(maxy,i-mp.get(sum));
            }
            else{
                mp.put(sum,i);
            }
        }
        return maxy;
    }
}