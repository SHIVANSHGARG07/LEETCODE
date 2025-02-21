
class FindElements {
    private HashSet<Integer>st;
    public FindElements(TreeNode root) {
        root.val=0;
        st = new HashSet<>();
        func(root);
    }
    private void func(TreeNode root){
       st.add(root.val);
       if(root.left!=null){
        root.left.val = 2*root.val+1;
        func(root.left); 
       }
       if(root.right!=null){
        root.right.val=2*root.val+2;
        func(root.right);
       }

    }
    
    public boolean find(int target) {
        return st.contains(target);
    }
}