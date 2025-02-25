class Solution {
     int count=0;
    public int trailingZeroes(int n) {
      while(n>=5){
        count+=(n/5);
        n/=5;
      }
      return count;
        
    }
}