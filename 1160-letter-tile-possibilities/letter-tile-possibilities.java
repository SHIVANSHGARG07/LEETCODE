class Solution {
    private void backtrack(String tiles,HashSet<String>st,StringBuilder sb,boolean[] vis){
        if(sb.length()>0){
            st.add(sb.toString());
            
        }

        for(int i=0;i<tiles.length();i++){
            if(vis[i]){
                continue;
            }

            sb.append(tiles.charAt(i));
            vis[i]=true;

            backtrack(tiles,st,sb,vis);

            sb.deleteCharAt(sb.length()-1);
            vis[i]=false;
        }
    }
    public int numTilePossibilities(String tiles) {
        HashSet<String>st = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        boolean[] vis = new boolean[tiles.length()];
        backtrack(tiles,st,sb,vis);
        return st.size();
    }
}