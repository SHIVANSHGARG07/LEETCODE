class Solution {
    public boolean solve(int idx,String s,Boolean[]arr,List<String> wordDict){
        int n = s.length();
        //base case
        if(idx==n) return true;  //as reached at end means all above are true 

         //memoisation
        if(arr[idx]!=null) return arr[idx];   // that i have checked this previously and storedd ANSWER

        for(int i=idx;i<=n;i++){
            String temp = s.substring(idx,i);

            if(wordDict.contains(temp) && solve(i,s,arr,wordDict)){
                return arr[idx]=true;
            }
        }
        ///else false;
        return arr[idx]=false;

    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] arr = new Boolean[s.length()];   //to check if this index contians what
        return solve(0,s,arr,wordDict);

    }
}