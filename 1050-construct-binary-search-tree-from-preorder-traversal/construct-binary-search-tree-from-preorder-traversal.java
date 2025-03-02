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
    public TreeNode bstFromPreorder(int[] pre) {
        int[] idx={0};
        return construct(pre,Integer.MAX_VALUE,idx);
    }
    private TreeNode construct(int[] pre,int bound,int[] idx){
        if(idx[0]>=pre.length || pre[idx[0]]>bound){
            return null;
        }

        TreeNode root = new TreeNode(pre[idx[0]++]);
        root.left = construct(pre,root.val,idx);
        root.right = construct(pre,bound,idx);

        return root;
    }
}