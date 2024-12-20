//Date : 20.12.2024
//Porblem Statement no : 2415.                      
//Porblem Statement Topic :  Reverse Odd Levels of Binary Tree


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
    public TreeNode reverseOddLevels(TreeNode root) {
        //Calls the helper method levelTraverse with
        levelTraverse(root.left , root.right , 0);
        return root;
    }

    //Recursive method to process the tree level by level
    private void levelTraverse(TreeNode node1, TreeNode node2, int level) {
        //If either node1 or node2 is null, the recursion stops for this path 
        if (node1 == null || node2 == null)
            return;
        
        //Checks if the current level is even than swap the values of the nodes
        if (level % 2 == 0) {
            int val = node1.val;
            node1.val = node2.val;
            node2.val = val;
        }

        //The left child of node1 and the right child of node2
        levelTraverse(node1.left, node2.right, level + 1);
        //The right child of node1 and the left child of node2
        levelTraverse(node1.right, node2.left, level + 1);
    }
}