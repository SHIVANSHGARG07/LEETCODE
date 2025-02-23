class Solution {
    public int compareVersion(String s1, String s2) {
        String[] a1 = s1.split("\\.");
        String[] a2 = s2.split("\\.");

        int maxLen = Math.max(a1.length,a2.length);

        for(int i=0;i<maxLen;i++){
            int num1 = (i<a1.length) ? Integer.parseInt(a1[i]):0;
            int num2 = (i<a2.length) ? Integer.parseInt(a2[i]):0;

            if(num1>num2){
                return 1;
            }
            if(num2>num1){
                return -1;
            }

        }
        return 0;
    }

}