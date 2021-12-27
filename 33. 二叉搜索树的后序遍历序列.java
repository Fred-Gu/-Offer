class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return helper(postorder, 0, postorder.length - 1);
    }
    private boolean helper(int[] postorder, int left, int right) {
        if (left >= right) return true;
        int ptr = left;
        while (postorder[ptr] < postorder[right]) ptr++;
        int mid = ptr; // left boundary of right child tree
        while (postorder[ptr] > postorder[right]) ptr++;
        return (ptr == right) && helper(postorder, left, mid - 1) && helper(postorder, mid, right - 1);
    }
}
