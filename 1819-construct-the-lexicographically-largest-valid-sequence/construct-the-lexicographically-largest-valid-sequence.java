class Solution {
    public int[] constructDistancedSequence(int n) {
          int[] res = new int[2*n-1];
          boolean[] used = new boolean[n+1];

          backtrack(res,used,n,0);
          return res;
    }
    private boolean backtrack(int[] res,boolean[] used,int n ,int idx){
        if(idx==res.length) return true;

        if(res[idx]!=0) return backtrack(res,used,n,idx+1);

        for(int num=n;num>=1;num--){
            if(used[num]) continue;

            if(num==1){
                res[idx]=1;
                used[1]=true;
                if(backtrack(res,used,n,idx+1)) return true;
                res[idx]=0;
                used[1]=false;
            }
            else if(idx+num<res.length && res[idx+num]==0){
                res[idx]=res[idx+num]=num;
                used[num]=true;
                if(backtrack(res,used,n,idx+1)) return true;
                res[idx]=res[idx+num]=0;
                used[num]=false;
            }
        }
        return false;
    }
}