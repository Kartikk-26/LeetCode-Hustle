//Date : 23.12.2024
//Porblem Statement no : 2471.                       
//Porblem Statement Topic :  Minimum Number of Operations to Sort a Binary Tree by Level


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
    public int minimumOperations(TreeNode root) {
        //If the input tree is empty (root == null), there are no operations
        if (root == null)
            return 0;

        //Creates a queue (q) to facilitate level-order traversal of the binary tree.
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int operations = 0;

        //This while loop runs until the queue becomes empty, i.e., all levels of the tree have been processed.
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            //Iterates through all nodes in the current level (size times).
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);
                //Adds the left and right children of the current node to the queue
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }

            //sort_level is a copy of the level list that is sorted to represent the desired order.
            List<Integer> sort_level = new ArrayList<>(level);
            Collections.sort(sort_level);
            //mp is a HashMap that maps each node value to its index in the level list.
            Map<Integer, Integer> mp = new HashMap<>();

            //Populates the mp map with key-value pairs where the key is a value from the level list
            for (int i = 0; i < level.size(); i++) {
                mp.put(level.get(i), i);
            }

            //Iterates through the level list to ensure each element matches its corresponding position
            for (int i = 0; i < level.size(); i++) {
                //If the current element is not in the correct position
                while (!level.get(i).equals(sort_level.get(i))) {
                    operations++;
                    int cur = mp.get(sort_level.get(i));
                    mp.put(level.get(i), cur);
                    Collections.swap(level, i, cur);
                }
            }
        }

        //After processing all levels of tree, the total number of swaps required to sort all levels is returned
        return operations;
    }
}