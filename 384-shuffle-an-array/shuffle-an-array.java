class Solution {
    private int[] nums;
    private int[] original;
    private Random random;

    public Solution(int[] nums) {
       this.nums = nums;
       this.original = nums.clone();
       this.random = new Random(); 
    }
    
    public int[] reset() {
        return original;
    }
    
    public int[] shuffle() {
        int[] shuff = this.nums.clone();
        for(int i=shuff.length-1;i>0;i--){
            int j = random.nextInt(i+1);
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        return shuff;
    }
}
