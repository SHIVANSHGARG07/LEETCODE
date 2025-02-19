class Solution {
    private void backtrack(int n , StringBuilder sb,List<String>st){
        if(sb.length()==n){
            st.add(sb.toString());
            return;
        }

        for(char ch ='a';ch<='c';ch++){
            if(sb.length()==0 || sb.charAt(sb.length()-1)!=ch){
                sb.append(ch);
                backtrack(n,sb,st);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
    public String getHappyString(int n, int k) {

      StringBuilder sb = new StringBuilder();
      // idx to check length
      // add from char = a to char = z


      List<String>list = new ArrayList<>();
    backtrack(n,sb,list);

     if(list.size()>=k){
      return list.get(k-1);
     }else{
        return "";
     }
    }
}