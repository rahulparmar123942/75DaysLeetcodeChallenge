import java.util.*;

class Pair{
    TreeNode node;
    int level;

    Pair(TreeNode node,int level){
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        while(!q.isEmpty()){

            Pair front = q.remove();

            if(ans.size() == front.level){
                ans.add(new ArrayList<>());
            }

            if(front.level % 2 == 0){
                ans.get(front.level).add(front.node.val);
            }else{
                ans.get(front.level).add(0, front.node.val);
            }

            if(front.node.left != null){
                q.add(new Pair(front.node.left, front.level + 1));
            }

            if(front.node.right != null){
                q.add(new Pair(front.node.right, front.level + 1));
            }
        }

        return ans;
    }
}