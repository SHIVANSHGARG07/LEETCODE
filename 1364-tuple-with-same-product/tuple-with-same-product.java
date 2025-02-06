class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int pro = nums[i]*nums[j];
                mp.put(pro,mp.getOrDefault(pro,0)+1);
            }
        }
        int count=0;
        for (int num : mp.values()) {
            if (num > 1) {
                count += 8 * (num * (num - 1)) / 2;
            }
        }
        
        return count;
    }
}