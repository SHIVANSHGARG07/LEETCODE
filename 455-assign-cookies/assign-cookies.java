class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        int m = g.length;
        int n = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=m-1,j=n-1;
        while(i>=0 && j>=0){
            if(s[j]>=g[i]){
                count++;
                j--;
            }
            i--;
        }
        return count;
    }
}