class Solution {
    int preIndex =0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return func(preorder,postorder,0,postorder.length-1);
    }
    private TreeNode func(int[] preOrder,int[] postOrder,int postStart,int postEnd){
        if(postStart>postEnd){
            return null;
        }

        TreeNode root = new TreeNode( preOrder[preIndex++]);

        if(postStart == postEnd || preIndex>= preOrder.length) return root;

        int index = find(postOrder,postStart,postEnd,preOrder[preIndex]);

        if(index!=-1){
            root.left = func(preOrder,postOrder,postStart,index);
            root.right = func(preOrder,postOrder,index+1,postEnd-1);
        }
            
        return root;
    }

    private int find(int[] postOrder,int s,int e,int ele){
        for(int i=s;i<=e;i++){
            if(postOrder[i]==ele){
                return i;
            }
        }
        return -1;
    }
}