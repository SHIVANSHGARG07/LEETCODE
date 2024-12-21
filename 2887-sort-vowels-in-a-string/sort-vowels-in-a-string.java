class Solution {
    public static boolean isVowel(char c) {        
        // Check if the character is one of the vowels
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
    public String sortVowels(String s) {
        char[] arr = new char[s.length()];
        int i=0;
        for(char c:s.toCharArray()){
            if(isVowel(c)){
            arr[i++] = c;
            }
        }
        Arrays.sort(arr,0,i);

        StringBuilder str = new StringBuilder();
        int j=0;
        for(char c:s.toCharArray()){
            if(isVowel(c)){
                str.append(arr[j++]);
            }
            else{
                str.append(c);
            }
        }
        return str.toString();

    }
}