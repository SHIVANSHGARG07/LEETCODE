class Solution {

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

  
    public int maxVowels(String s, int k) {
       int max=Integer.MIN_VALUE,count=0;

       int r=0,l=0;
int n = s.length();
       while(r<n){
        char ch = s.charAt(r);

        if(isVowel(ch)){
            count++;
        }

        while(r-l+1>k){
            char c= s.charAt(l);
            if(isVowel(c)){
                count--;
            }
            l++;
        }

        if(r-l+1==k){
            max = Math.max(max,count);
        }

        r++;
       }
       return max;
    }

}