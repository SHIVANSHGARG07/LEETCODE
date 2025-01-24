class Solution {
    int ans=0;
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        func(root,root.val);
        return ans;
    }
    private void func(TreeNode root,int val){
        if(root==null) return ;
        if(root.val>=val){
            ans++;
            val = root.val;
        }
        func(root.left,val);
        func(root.right,val);
    }
}