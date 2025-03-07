class Solution {
    private boolean check(String s1,String s2){
       HashMap<Character,Integer>mp = new HashMap<>();
       for(char c:s1.toCharArray()){
        mp.put(c,mp.getOrDefault(c,0)+1);
       }
       for(char c:s2.toCharArray()){
        mp.put(c,mp.getOrDefault(c,0)+1);
       }

       for(int n:mp.values()){
        if(n>1){
            return false;
        }
       }
       return true;

    }
    private int func(List<String> arr,int idx,StringBuilder sb){
        int n = arr.size();
        if(idx>=n){
            return sb.length();
        }


   int exclude=0,include=0;
   exclude = func(arr,idx+1,sb);


   if(check(sb.toString(),arr.get(idx))){
sb.append(arr.get(idx));  // Append current string
            include = func(arr, idx + 1, sb);
            sb.setLength(sb.length() - arr.get(idx).length());   
   }
   return Math.max(include,exclude);



    }
    public int maxLength(List<String> arr) {
        StringBuilder sb = new StringBuilder();

        return func(arr,0,sb);
    }
}