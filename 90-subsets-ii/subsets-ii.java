class Solution {
    HashSet<List<Integer>>st = new HashSet<>();
   private void func(int[] nums,int idx,List<Integer>list){
    if(idx>=nums.length){
        if(!st.contains(list)){
        st.add(new ArrayList<>(list));
        }
        return;
    }
    list.add(nums[idx]);
    func(nums,idx+1,list);
    list.remove(list.size()-1);
    func(nums,idx+1,list);
    
   }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(nums);
        func(nums,0,new ArrayList<>());

        for(List<Integer>list:st){
            ans.add(list);
        }
        return ans;
    }
}