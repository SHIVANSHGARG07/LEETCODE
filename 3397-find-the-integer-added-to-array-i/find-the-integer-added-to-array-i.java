class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m1 = nums1.length;
        int m2 = nums2.length;

        return nums2[m2-1]-nums1[m1-1];
    }
}