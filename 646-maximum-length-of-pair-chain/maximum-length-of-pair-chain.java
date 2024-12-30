class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1]));
        int last = Integer.MIN_VALUE;
        int count=0;

        for(int[]pair: pairs){
            if(pair[0]>last){
                count++;
                last=pair[1];
            }
        }
        return count;
    }
}