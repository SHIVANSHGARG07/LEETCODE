class Solution {
    List<List<Integer>>two = new ArrayList<>();
    List<Integer>one = new ArrayList<>();

    public void backtrack(int[] nums,HashSet<Integer>used){
        int n = nums.length;
     if(one.size()==n){
        two.add(new ArrayList<>(one));
     }
     for(int i=0;i<n;i++){
        if(used.contains(i)) continue;
        used.add(i);
        one.add(nums[i]);

        backtrack(nums,used);
        used.remove(i);
        one.remove(one.size()-1);
     }
    }
    public List<List<Integer>> permute(int[] nums) {
        HashSet<Integer>used = new HashSet<>();
        backtrack(nums,used);
        return two;
    }
}