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
    public void dfs(TreeNode root,int sum,int targetSum,List<Integer>Path,List<List<Integer>>ans){

         if(root== null) return;

         Path.add(root.val);

         sum += root.val;

         if(root.left==null && root.right==null && sum == targetSum){
            ans.add(new ArrayList<>(Path));
         }

         dfs(root.left , sum , targetSum ,Path, ans);
         dfs(root.right , sum , targetSum,Path, ans);
         Path.remove(Path.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> Path = new ArrayList<>();

        dfs(root,0,targetSum,Path,ans);
        return ans;
    }
}