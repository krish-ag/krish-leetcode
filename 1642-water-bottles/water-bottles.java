class Solution {
    public int numWaterBottles(int nB, int nE) {
        int count = 0;
        int left = 0;
        while (nB > 0) {
            count += nB;
            int temp = left;
            left = (nB+left) % nE;
            nB = (nB + temp) / nE;
        }
        return count;

        
    }
}