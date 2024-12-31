class Solution {
    public String removeDigit(String s, char digit) {
        String ans = "";
        int n = s.length();
        for(int i=0;i<n;i++){
          if(s.charAt(i)==digit){
            String newString = s.substring(0,i)+s.substring(i+1,n);
            ans = ans.compareTo(newString)<0?newString:ans;
          }

        }
        return ans;
    }
}