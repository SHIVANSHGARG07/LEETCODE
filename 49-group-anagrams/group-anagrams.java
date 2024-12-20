class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String , List<String>>mp = new HashMap<>();
        for(String str:strs){
          char[] arr = str.toCharArray();
          Arrays.sort(arr);
          String sorted = new String(arr);

          if(!mp.containsKey(sorted)){
            mp.put(sorted,new ArrayList<>());
          }
          mp.get(sorted).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}