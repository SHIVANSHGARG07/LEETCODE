class Solution {
    private void backtrack(int n , StringBuilder sb,HashSet<String>st){
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
      HashSet<String>st = new HashSet<>();
      StringBuilder sb = new StringBuilder();
      // idx to check length
      // add from char = a to char = z

      backtrack(n,sb,st);

      List<String>list = new ArrayList<>();
      for(String word:st){
        list.add(word);
      }
      Collections.sort(list);
       
     if(list.size()>=k){
      return list.get(k-1);
     }else{
        return "";
     }
    }
}