class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        Arrays.sort(products);
        int n = searchWord.length();
        List<List<String>>ans = new ArrayList<>();

        for(int i=0;i<n;i++){
           String a = searchWord.substring(0,i+1);

           List<String>list = new ArrayList<>();
           int count=0;

            for(String word:products){
               if(word.startsWith(a)){
                list.add(word);
                count++;
               }
               if(count==3){
                break;
               }
            }
            ans.add(list);
        }
        return ans;
    }
}