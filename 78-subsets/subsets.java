class Solution {
    List<List<Integer>>ans = new ArrayList<>();
    public void make(int[] nums,int index,ArrayList<Integer>list){
        int n=nums.length;
        if(index>=n){
            ans.add(new ArrayList<>(list));
            return ;
        }
        int num = nums[index];
        list.add(num);
        make(nums,index+1,list);

        list.remove(list.size()-1);
        make(nums,index+1,list);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer>list = new ArrayList<>();
        make(nums,0,list);
        return ans;
    }
}