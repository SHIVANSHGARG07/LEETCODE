
class Solution {
    public void post(TreeNode root,List<Integer>ans){
        if(root == null) return ;
                post(root.left,ans);
        post(root.right,ans);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        post(root,ans);
        return ans;
    }
}