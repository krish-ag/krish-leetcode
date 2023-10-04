class Solution {
    public int maxSubArray(int[] nums) {
        int ans = -10001;
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            ans = ans > sum ? ans : sum;
            sum = sum < 0 ? 0: sum;
        }

        return ans;

    }
}