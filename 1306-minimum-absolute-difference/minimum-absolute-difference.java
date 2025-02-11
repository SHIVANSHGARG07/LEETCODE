class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int target = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            target = Math.min(target,arr[i+1]-arr[i]);
        }
        System.out.println(target);
         for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]==target){
                ans.add(Arrays.asList(arr[i],arr[i+1]));
            }
         }
         return ans;
    }
}