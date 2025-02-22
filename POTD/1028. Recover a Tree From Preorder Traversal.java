//Date : 22.02.2025                        
//Porblem Statement Number & Topic : 1028. Recover a Tree From Preorder Traversal

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
    public TreeNode recoverFromPreorder(String s) {
        Stack<TreeNode> st= new Stack<>();
        int ind=0;
        while(ind<s.length()){
            int dep=0;
            while(ind<s.length() && s.charAt(ind)=='-'){
                dep+=1;
                ind+=1;
            }
            int val=0;
            while(ind<s.length() && Character.isDigit(s.charAt(ind))){
                val= val*10+ (s.charAt(ind)-'0');
                ind+=1;
            }
            TreeNode node= new TreeNode(val);
            while(st.size()>dep) st.pop();
            if(!st.isEmpty()){
                if(st.peek().left==null){
                    st.peek().left= node;
                }else{
                    st.peek().right= node;
                }
            }
            st.push(node);
        }
        while(st.size()>1) st.pop();
        return st.peek();
    }
}











