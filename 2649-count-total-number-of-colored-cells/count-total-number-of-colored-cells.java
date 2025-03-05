class Solution {
    public long coloredCells(int n) {
        if(n==1) return 1;  // base case

        long sum=0;

        while(n>1){
            sum = sum + (n-1)*4;
            n--;
        }
        return 1+sum; 
    }
}