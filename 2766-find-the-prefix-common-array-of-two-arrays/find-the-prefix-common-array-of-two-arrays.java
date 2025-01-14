class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int n = a.length;
        int fq[] = new int[n+1];
        int[] ans = new int[n];
int count=0;
        for(int i=0;i<n;i++){
            fq[a[i]]++;
            if(fq[a[i]]==2) count++;

            fq[b[i]]++;
            if(fq[b[i]]==2) count++;

            ans[i]=count;
        }
        return ans;
        

    }
}