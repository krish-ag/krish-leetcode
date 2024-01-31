class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> e = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        getCoinsSum(candidates, target, e, 0, result);
        return result;
    }

    public static int getCoinsSum(int[] coins, int sum, List<Integer> ll, int i, List<List<Integer>> ans) {
        if (sum == 0) {
            ans.add(new ArrayList<>(ll));
            return 1;
        }

        int res = 0;
        for (; i < coins.length; i++) {
            if (sum < coins[i]) {
                continue;
            }
//            if (!used[i]) {
//                used[i] = true;
            ll.add(coins[i]);
            res += getCoinsSum(coins, sum - coins[i], ll, i, ans);
            ll.remove(ll.size() - 1);
//                used[i] = false;
//        }
        }
        return res;
    }



}