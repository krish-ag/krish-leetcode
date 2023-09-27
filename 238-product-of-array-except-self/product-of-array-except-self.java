class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n-1] = 1;


        for (int i = 0; i < n - 1; i++ ){
            left[i+1] = left[i] * nums[i];
            right[n-2-i] = right[n-1-i] * nums[n-1-i];
        }

        for (int i = 0; i < n; i++) {
            left[i] *= right[i];
        }


        return left;

    }
}