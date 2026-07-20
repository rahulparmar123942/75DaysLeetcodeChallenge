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
    int preIdx = 0;
    public TreeNode helper(int[] preorder,int upperBound){
         
         if(preIdx == preorder.length || preorder[preIdx]>upperBound )return null;

         TreeNode root = new TreeNode(preorder[preIdx]);
         preIdx++;
         
         root.left = helper(preorder,root.val); 
         root.right = helper(preorder,upperBound);

         return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        
        return helper(preorder,Integer.MAX_VALUE);
    }
}