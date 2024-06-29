/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        int last0 = -1;
        int last1 = -1;

        while (left <= right) {
            int mid = left+(right-left)/2;

            if (isBadVersion(mid) && last0 == mid-1) {
                return mid;
            } else if (!isBadVersion(mid) && last1 == mid+1) {
                return mid + 1;
            } else {

                if (!isBadVersion(mid)){
                    left = mid + 1;
                    last0 = mid;
                }
                else {
                    right = mid - 1;
                    last1 = mid;
                }

            }
        }

        return -1;

    }
}