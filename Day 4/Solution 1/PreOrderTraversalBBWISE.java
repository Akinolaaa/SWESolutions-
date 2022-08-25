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
/*
    ALGORITHIM
    1.  Create a Stack variable to store TreeNode values.    ===== DONE
    2.  Iterate through the Tree nodes and output the values using DFS
*/
class PreOrderTraversalBBWISE{
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList <Integer> output = new ArrayList<Integer>();
        if(root==null) return output;
        Stack <TreeNode> storage = new Stack<TreeNode>();
        //Queue <Integer> storage = LinkedList<Integer>();
        //output.add(root.val);
        storage.push(root);
        while(!(storage.isEmpty())){
            TreeNode now = storage.pop();
            output.add(now.val);
            if(now.right!=null)storage.push(now.right);
            if(now.left!=null)storage.push(now.left);
        }
        return output;
    }
}