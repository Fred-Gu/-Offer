/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int[] preorder;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }

    private TreeNode recur(int pre_root, int left_bound, int right_bound) {
        if (left_bound > right_bound) return null;
        TreeNode root = new TreeNode(preorder[pre_root]);
        int idx = map.get(preorder[pre_root]);
        root.left = recur(pre_root + 1, left_bound, idx - 1);
        root.right = recur(pre_root + (idx - left_bound + 1), idx + 1, right_bound);
        return root;
    }
}
