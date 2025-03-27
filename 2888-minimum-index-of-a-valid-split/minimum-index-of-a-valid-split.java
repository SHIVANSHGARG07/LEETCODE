class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();

      HashMap<Integer,Integer>mp = new HashMap<>();
      for(int num:nums){
        mp.put(num,mp.getOrDefault(num,0)+1);
      }  

      int ele = -1 , total=0;
      for(int num:mp.keySet()){
        if(mp.get(num)*2 > n){
            ele = num;
            total = mp.get(num);
        }
      }

      int lefty=0;
      for(int i=0;i<n-1;i++){
        if(nums.get(i)==ele){
            lefty++;
        }

        int leftsize =i+1;
        int rightsize = n-leftsize;
        int righty = total-lefty;

        if(lefty*2 >leftsize && righty*2 > rightsize){
            return i;
        }
      }
      return -1;
      

    }
}