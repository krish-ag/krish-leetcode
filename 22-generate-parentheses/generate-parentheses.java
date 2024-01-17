class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        count(ans, 2*n, "", 0);
        return ans;
    }

    static int count(ArrayList<String> res, int n, String ans, int opened) {
        if (opened < 0) return 0;
        if (n < opened) return 0;

        if (n == 0) {
            res.add(ans);
            return 1;
        }

        return count(res, n - 1, ans + "(", opened + 1) + count(res, n - 1, ans + ")", opened - 1);
    }
}