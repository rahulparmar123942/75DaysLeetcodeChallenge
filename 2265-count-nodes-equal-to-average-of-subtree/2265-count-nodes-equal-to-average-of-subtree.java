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
    public int find(TreeNode root){
        
        if(root == null ){
            return 0;
        }
        return 1+find(root.left) +find(root.right);
    }
    public int averageOfSubtree(TreeNode root) {

        if(root == null) return 0;
        int n = find(root);
        
        int ans = sum(root);
        
        int count =0;
        if(ans/n == root.val){
            count++;
        }
        
         count+=averageOfSubtree(root.left);
         count += averageOfSubtree(root.right);

         return count;
    }
    public int sum(TreeNode root){

        if(root == null) return 0;

        int left = sum(root.left);
        int right = sum(root.right);

        return root.val+left+right;
    }
}