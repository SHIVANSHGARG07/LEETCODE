class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
         int num1 = Arrays.stream(nums1).min().getAsInt();
         int num2 = Arrays.stream(nums2).min().getAsInt();
         return num2-num1;
    }
}