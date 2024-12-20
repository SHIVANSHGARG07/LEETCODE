 // make flag and if flag is true means odd then add in /
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
     func(root.left,root.right,true);
     return root;
    }
    public void func(TreeNode node1,TreeNode node2,boolean flag){
        if(node1==null || node2==null){
            return ;
        }
        if(flag){
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }
        func(node1.left,node2.right,!flag);
        func(node1.right,node2.left,!flag);
    }
}