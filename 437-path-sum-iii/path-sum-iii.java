class Solution {
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        path(root,targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return count;
    }
    public void path(TreeNode root,int target,long sum){
        if(root == null) return;
        sum+=root.val;
        if(sum==target) count++;
        path(root.left,target,sum);
        path(root.right,target,sum);
    }

}