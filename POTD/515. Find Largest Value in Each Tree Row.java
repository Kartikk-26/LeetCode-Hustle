//Date : 25.12.2024
//Porblem Statement no : 515.                         
//Porblem Statement Topic :  Find Largest Value in Each Tree Row

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
    public List<Integer> largestValues(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelMax = Integer.MIN_VALUE, size = q.size();
            for (int i = 0; i < size; ++i) {
                TreeNode node = q.poll();
                levelMax = Math.max(levelMax, node.val);
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
            result.add(levelMax);
        }
        return result;
    }
}