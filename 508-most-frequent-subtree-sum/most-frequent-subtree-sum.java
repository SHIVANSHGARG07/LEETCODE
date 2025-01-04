/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int  func(TreeNode root,List<Integer>ans){
        if(root==null) return 0;
        
        int leftSum = func(root.left,ans);
        int rightSum = func(root.right,ans);

        int sum = root.val+leftSum+rightSum;
        ans.add(sum);
        return sum;

    }
    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        func(root,ans);

        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int num:ans){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int maxy = 0;
        for(int num:mp.values()){
            maxy = Math.max(maxy,num);
        }
        List<Integer> resultList = new ArrayList<>();
        for (int sum : mp.keySet()) {
            if (mp.get(sum) == maxy) {
                resultList.add(sum);
            }
        }

        // Convert the result list to an array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;

    }
}