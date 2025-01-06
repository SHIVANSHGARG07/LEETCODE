class Solution {
    public int[] minOperations(String boxes) {
        // ow optimised approach shoule be left to right and then right to left
        int n = boxes.length();
        int[] ans = new int[n];
        int opsleft=0,countl=0;
        for(int i=0;i<n;i++){
            ans[i]+=opsleft;
            countl+=boxes.charAt(i)-'0'; // for 0 and 1
            opsleft+=countl;
        }
        int opsright=0,countr=0;
        for(int i=n-1;i>=0;i--){
            ans[i]+=opsright;
            countr+=boxes.charAt(i)-'0'; // for 0 and 1
            opsright+=countr;
        }
        return ans;
    }
}

// class Solution {
//     public int[] minOperations(String boxes) {
//     int n = boxes.length();
//       int[] ans = new int[n];
//       for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             if(i!=j && boxes.charAt(j)=='1'){
//                 ans[i]+=Math.abs(j-i);
//             }
//         }
//       }
//       return ans;

//     }
// }