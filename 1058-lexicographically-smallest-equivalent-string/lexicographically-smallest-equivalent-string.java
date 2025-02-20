class Solution {
    private HashMap<Character, Character> parent = new HashMap<>();


    private void init(){
        for(char c='a';c<='z';c++){
            parent.put(c,c);
        }
    }

    private char find(char x){
       if(parent.get(x)!=x){
        parent.put(x,find(parent.get(x)));
       }
       return parent.get(x);
    }

    private void union(char c1,char c2){
        char p1 = find(c1);
        char p2 = find(c2);

        if(p1!=p2){
           if(p1<p2){
            parent.put(p2,p1);
           }else{
            parent.put(p1,p2);
           }
        }
    }

    public String smallestEquivalentString(String s1, String s2, String b) {
        StringBuilder sb = new StringBuilder();
        init();

        for(int i=0;i<s1.length();i++){
            union(s1.charAt(i),s2.charAt(i));
        }

        for(int i=0;i<b.length();i++){
          sb.append(find(parent.get(b.charAt(i))));
        }
        return sb.toString();

    }
}