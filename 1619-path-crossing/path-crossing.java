class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String>st = new HashSet<>();
        int x=0,y=0;
        st.add(x+","+y);

        for(char c:path.toCharArray()){
            if(c=='N') y++;
            else if(c=='S')y--;
            else if(c=='E')x++;
            else x--;
        

        String pos = x+","+y;
        if(st.contains(pos)){
     return true;
        }
        st.add(pos);
        }
        return false;
        
    }
}