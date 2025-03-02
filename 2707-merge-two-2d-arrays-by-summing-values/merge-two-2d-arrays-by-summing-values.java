class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer>mp = new TreeMap<>();

        for(int[] num:nums1){
          mp.put(num[0],mp.getOrDefault(num[0],0)+num[1]);
        }
        for(int[] num:nums2){
          mp.put(num[0],mp.getOrDefault(num[0],0)+num[1]);
        }

        int[][] ans = new int[mp.size()][2];
int idx=0;
        for(int num:mp.keySet()){
            ans[idx++]=new int[]{num,mp.get(num)};
        }
        return ans;
    }
}