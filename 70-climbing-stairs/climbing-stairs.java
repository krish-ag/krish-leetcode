class Solution {
    public int climbStairs(int n) {
        if (n < 39) {
            if (n == 0) return 1;
            if (n < 0) return 0;
            return climbStairs(n - 1) + climbStairs(n - 2);
        }

        return (int) (Math.pow((0.5 + Math.sqrt(5) / 2), n + 1) / Math.sqrt(5));
    }
}