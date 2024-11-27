class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int start = 0;
        int end = 0;
        int prod = 1;
        int ans = 0;

        while (end < arr.length) {
            prod *= arr[end];

            while ( !(prod < k) && start <= end) {
                prod /= arr[start];
                start++;
            }
            ans += end - start + 1;
            end++;
        }
        return ans;
    }

}