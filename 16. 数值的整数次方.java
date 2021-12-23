class Solution {
    public double myPow(double x, int n) {
        if (x == 0) return 0;

        long b = n;
        double res = 1.0;

        if (b < 0) {
            x = 1 / x;
            b = -b;
        }

        while (b > 0) {
            if ((b & 1) == 1) res *= x;
            b >>= 1;
            if (b > 0) x *= x;
        }
        return res;
    }
}
