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
    private void inorder(TreeNode root,List<Integer>list){
    if(root==null) return;
    inorder(root.left,list);
    list.add(root.val);
    inorder(root.right,list);
    }
    public int minDiffInBST(TreeNode root) {
        List<Integer>list = new ArrayList<>();
        inorder(root,list);

        Collections.sort(list);
        int ans=Integer.MAX_VALUE;
        int n = list.size();
        for(int i=1;i<n;i++){
           ans = Math.min(ans,list.get(i)-list.get(i-1));
        }
        return ans;
    }
}