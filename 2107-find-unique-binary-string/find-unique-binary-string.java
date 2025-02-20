class Solution {
    private static void backtrack(int idx,StringBuilder sb,int n ,List<String>list){
        if(idx==n){
            list.add(sb.toString());
            return;
        }

        sb.append('0');
        backtrack(idx+1,sb,n,list);
        sb.deleteCharAt(sb.length()-1);

        sb.append('1');
        backtrack(idx+1,sb,n,list);
        sb.deleteCharAt(sb.length()-1);

    }

    public String findDifferentBinaryString(String[] nums) {
        
        int n = nums[0].length();
        List<String>ans = new ArrayList<>();
        HashSet<String>st = new HashSet<>();
        
        StringBuilder sb = new StringBuilder();

        backtrack(0,sb,n,ans);

        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        for(String word:ans){
            if(!st.contains(word)){
                return word;
            }
        }
        return "";



    }
}