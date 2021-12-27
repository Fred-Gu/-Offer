class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int idx_popped = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && popped[idx_popped] == stack.peek()) {
                stack.pop();
                idx_popped++;
            }
        }
        return stack.isEmpty();
    }
}
