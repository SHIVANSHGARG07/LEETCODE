class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String>st = new HashSet<>();
        for(String word:words){
            for(String word2:words){
                if(word2.contains(word) && !word2.equals(word)){
                    st.add(word);
                }
            }
        }
        List<String>arr = new ArrayList<>();
        for(String word:st){
            arr.add(word);
        }
        return arr;
    }
}