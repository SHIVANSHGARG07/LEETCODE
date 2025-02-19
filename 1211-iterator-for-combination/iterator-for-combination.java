class CombinationIterator {
    
    private String s;
    private int k;
    private List<String>list;
    // private int index;

    public CombinationIterator(String s, int k) {
        this.s=s;
        this.k=k;
        this.list = func(s,k);
    }

    private void backtrack(String s,int k,int idx,StringBuilder sb,List<String>ans){
        if(sb.length()==k){
          ans.add(sb.toString());
          return;
        }

        for(int i=idx;i<s.length();i++){
            sb.append(s.charAt(i));
            backtrack(s,k,i+1,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String>func(String s,int k){
        List<String>ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        backtrack(s,k,0,sb,ans);
        return ans;

    }
    
    public String next() {
      if(hasNext()){
        return list.remove(0);
      }
      else{
        return "";
      }
      

    }
    
    public boolean hasNext() {
        return !list.isEmpty();
    }
}