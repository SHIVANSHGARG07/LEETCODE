// class Solution {
//     public int[] successfulPairs(int[] spells, int[] potions, long success) {
//         Arrays.sort(potions);
//         int n = spells.length;
//         int[] ans = new int[n];
//         int idx=0;

//         for(int i=0;i<n;i++){
//             int count = binary(spells[i],potions,success);
//             ans[idx++]=count;
//         }
//         return ans;


//     }
//     private int binary(int number,int[] potions,long target){
//         int left = 0,right = potions.length-1;
//         int n = potions.length;
//         int count=0;

//         while(left<right){
//             int mid = left+(right-left)/2;
//             if((long)number*potions[mid]>=target){
//                 count+=n-mid;
//                 right=mid;
//             }
//             else{
//                 left=mid+1;
//             }
//         }
//         return count;
//     }
// }
import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = binary(spells[i], potions, success); // Direct assignment
        }
        return ans;
    }

    private int binary(int number, int[] potions, long target) {
        int left = 0, right = potions.length - 1; 
        int n = potions.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) number * potions[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return n - left; 
    }
}
