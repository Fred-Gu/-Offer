class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (result.contains(nums[i])) {
                return nums[i];
            } else {
                result.add(nums[i]);
            }
        }
        return -1;
    }
}
