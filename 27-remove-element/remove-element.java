class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int[] arr = new int[nums.length];
        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] == val) continue;
            arr[k] = nums[i];
            k++;
        }
        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
        return k;
    }
}