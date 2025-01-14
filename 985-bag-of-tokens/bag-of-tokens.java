class Solution {
    public int bagOfTokensScore(int[] arr, int power) {
        Arrays.sort(arr);
        int n = arr.length;
        boolean[] vis = new boolean[n];
        int score=0;
        int i=0,j=n-1;

        while(i<j){
            if(power>=arr[i]){
             score++;
             power-=arr[i];
             i++;
            }
            else if(score>0) {
                // if(score==0 || i == j) break;
              score--;
              power+=arr[j];
              j--;
            }
            else{
                i++;
                j--;
            }
        }
        if(i==j){
            if(arr[i]<=power){
                score++;
            }
        }
        return score;
    }
}