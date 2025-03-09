class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        // append this 2 times
        int n = colors.length; 
        int[] arr = new int[n+k-1];

        for(int i=0;i<n+k-1;i++){
            arr[i]=colors[i%n];
        }


        int l=0;
        int count=0;

       for(int r=0;r<n+k-1;r++){
        if(r>0 && arr[r]==arr[r-1]){
            l=r;
        }

        if(r-l+1>=k){
            count++;
            l++;
        }



       }
       return count;

    }
}