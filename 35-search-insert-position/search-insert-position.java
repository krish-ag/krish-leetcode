class Solution {
    public int searchInsert(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if (target > arr[mid]){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }
}