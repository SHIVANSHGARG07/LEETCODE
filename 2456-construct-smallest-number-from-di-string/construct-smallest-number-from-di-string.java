class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        int num =1;
        for(char c:pattern.toCharArray()){
            temp.append(num);
            num++;
            if(c=='I'){
                sb.append(temp.reverse());
                temp = new StringBuilder();
            }

            
        }
        temp.append(num);
        sb.append(temp.reverse());

        return sb.toString();
    }
}