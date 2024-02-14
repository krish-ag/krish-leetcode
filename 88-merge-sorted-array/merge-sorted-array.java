class Solution {
    public void merge(int[] nums1, int m, int[] num2, int n) {
        int[] num1 = new int[m];
        for (int i = 0; i < m; i++) {
            num1[i] = nums1[i];
        }

        int x = 0;
        int y = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (x < num1.length && y < num2.length) {
                if (num1[x] < num2[y]){
                    nums1[i] = num1[x];
                    x++;
                }
                else {
                    nums1[i] = num2[y];
                    y++;
                }
            } else {
                if (x < num1.length) {
                    nums1[i] = num1[x];
                    x++;
                } else {
                    nums1[i] = num2[y];
                    y++;
                }
            }
        }
    }
}
