class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>st = new HashSet<>();

        int maxy = Integer.MIN_VALUE;

        for(int num:nums){
            if(num>0){
                st.add(num);
            }
            maxy = Math.max(maxy,num);
        }

        if(st.isEmpty()){
            return 1;
        }
        for(int num=2;num<=maxy;num++){
            if(!st.contains(num-1)){
                return num-1;
            }
        }
        return maxy+1;
    }
}