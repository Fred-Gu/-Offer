class Solution {
    public int[] exchange(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums;

        int front = 0;
        int back = nums.length - 1;

        while (front < back) {
            if (nums[front] % 2 == 1) {
                front++;
            } else {
                if (nums[back] % 2 == 0) {
                    back--;
                } else {
                    int temp = nums[back];
                    nums[back] = nums[front];
                    nums[front] = temp;
                    front++;
                }
            }
        }
        return nums;
    }
}
