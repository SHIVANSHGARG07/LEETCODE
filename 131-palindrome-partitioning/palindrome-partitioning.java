class Solution {
    private boolean palindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    private void back(int idx,String s,List<String>grid,List<List<String>>ans){
        if(idx==s.length()){
         ans.add(new ArrayList<>(grid));
         return;
        }

        for(int i=idx;i<s.length();i++){
            // check palindrome or not
            if(palindrome(s,idx,i)){
             grid.add(s.substring(idx,i+1));
             back(i+1,s,grid,ans);
             grid.remove(grid.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
      List<List<String>>ans = new ArrayList<>();
      List<String>grid = new ArrayList<>();

      back(0,s,grid,ans);
      return ans;  
    }
}