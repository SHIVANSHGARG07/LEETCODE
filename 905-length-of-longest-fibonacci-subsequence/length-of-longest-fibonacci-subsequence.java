class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashSet<Integer>st = new HashSet<>();
        int n = arr.length;
        int maxy=0;

        for(int num:arr){
            st.add(num);
        }

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int a = arr[i],b=arr[j];
                int len = 2;

                while(st.contains(a+b)){
                    int c = a+b;
                    a=b;
                    b=c;
                    len++;
                }
                maxy = Math.max(maxy,len);

            }
        }

        if(maxy>=3){
            return maxy;
        }
        else{
            return 0;
        }
    }
}