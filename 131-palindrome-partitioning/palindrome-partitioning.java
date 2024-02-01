class Solution {
    public List<List<String>> partition(String s) {
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        partitions(s, "", ll, ans);
        return ans;
    }

        static Boolean isPalindrome(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return str.contentEquals(sb);
    }

    static void partitions(String str, String last, List<String> ll, List<List<String>> res){
        if (!isPalindrome(last)) {

            return;
        }
        if (str.isEmpty()) {
            res.add(new ArrayList<>(ll));
            return;
        }

        for (int i = 1; i <= str.length(); i++) {
            String sub = str.substring(i);
            ll.add(str.substring(0, i));
            partitions(sub, str.substring(0, i), ll, res);
            ll.remove(ll.size() - 1);
        }
    }


}