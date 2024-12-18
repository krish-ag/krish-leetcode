class Solution {
    public int removeDuplicates(int[] nums) {
        int last = 1000;
        int k = 0;
        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] == last) continue;
            nums[k] = nums[i];
            k++;
            last = nums[i];
        }
        return k;
    }
}