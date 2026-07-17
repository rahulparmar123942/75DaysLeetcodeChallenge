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
 import java.util.*;

class Pair {
    TreeNode node;
    int idx;

    Pair(TreeNode node, int idx) {
        this.node = node;
        this.idx = idx;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {

        if (root == null)
            return 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        int maxWidth = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            int minIdx = q.peek().idx;
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {

                Pair curr = q.poll();

                int currIdx = curr.idx - minIdx;

                if (i == 0)
                    first = currIdx;

                if (i == size - 1)
                    last = currIdx;

                if (curr.node.left != null)
                    q.offer(new Pair(curr.node.left, 2 * currIdx + 1));

                if (curr.node.right != null)
                    q.offer(new Pair(curr.node.right, 2 * currIdx + 2));
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }
}