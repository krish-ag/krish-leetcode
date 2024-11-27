class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int[] ans = new int[arr.length - k + 1];
        Deque<Integer> dQ = new LinkedList<>();
         for (int i = 0; i < k; i++) {
             while (!dQ.isEmpty() && arr[dQ.getLast()] < arr[i]) {
                 dQ.removeLast();
             }
             dQ.add(i);
         }
         int j = 0;
         ans[j++] = arr[dQ.getFirst()];
        for (int i = k; i < arr.length; i++) {
            while (!dQ.isEmpty() && arr[dQ.getLast()] < arr[i]) {
                dQ.removeLast();
            }
            dQ.add(i);
            if (i-k == dQ.getFirst()) {
                dQ.remove();  // removing first elemen (~~dQ.removeFirst();)
            }
            ans[j++] = arr[dQ.getFirst()];
        }
        return ans;
    }

}