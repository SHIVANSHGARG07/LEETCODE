class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
     TreeMap<Integer,Integer>mp = new TreeMap<>();
     for(int[] arr:grid){
        for(int num:arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
     }        
   int[] ans = new int[2];
     for(int i=1;i<=n*n;i++){
        if(mp.containsKey(i)){
       if(mp.get(i)==2){
        ans[0]=i;
       }
        }
        else{
            ans[1]=i;
        }


     }
     return ans;

    }
}