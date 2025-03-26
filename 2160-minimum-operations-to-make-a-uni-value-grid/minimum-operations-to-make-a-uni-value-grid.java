class Solution {
    public int minOperations(int[][] grid, int x) {
        // insert in array 
        // sort 
        // check by x remainder same go ahead 
        //else -1
        // if len even take median as n/2-1 ele and abs value from all and divide by x at last
        int m = grid.length;
        int n = grid[0].length;
        int size = m*n;

        int[] arr = new int[size]; 
        
        int idx=0;
        for(int[] row:grid){
            for(int num:row){
                arr[idx++]=num;
            }
        }

        Arrays.sort(arr);
        int rem = arr[0]%x;

        for(int num:arr){
            if(num%x!=rem){
                return -1;
            }
        }

        int median = arr[size/2];
        int ans=0;

        for(int num:arr){
            ans+=Math.abs(median-num);
        }
return ans/x;

    }
}

