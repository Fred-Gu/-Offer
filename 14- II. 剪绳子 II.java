class Solution {
    public int cuttingRope(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        if (n == 4) return 4;
        long result = 1l;
        int mod = 1000000007;
        while (n > 4) {
            result = result * 3 % mod;
            n -= 3;
        }
        return (int)(result * n % mod);
    }
}
