class Solution {
    public int numWays(int n) {
        int a = 1, b = 1, sum = 0;
        if (n == 0) return 1;
        if (n == 1) return 1;
        for (int i = 0; i < n - 1; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }
}
