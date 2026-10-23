class Solution {
    public double myPow(double x, int n) {
        long power = n;

        if (power < 0) {
            power = -power;
        }

        double ans = helper(x, power);

        if (n < 0) {
            return 1.0 / ans;
        }

        return ans;
    }

    public double helper(double x, long power) {
        if (power == 0) {
            return 1.0;
        }

        double half = helper(x, power / 2);

        if (power % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}