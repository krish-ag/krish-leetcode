class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        letterCombinations(digits, "", ans);
        return ans;
    }

    public static char[] getchars(int digit){
        return switch (digit) {
            case 2 -> new char[]{'a', 'b', 'c'};
            case 3 -> new char[]{'d', 'e', 'f'};
            case 4 -> new char[]{'g', 'h', 'i'};
            case 5 -> new char[]{'j', 'k', 'l'};
            case 6 -> new char[]{'m', 'n', 'o'};
            case 7 -> new char[]{'p', 'q', 'r', 's'};
            case 8 -> new char[]{'t', 'u', 'v'};
            case 9 -> new char[]{'w', 'x', 'y', 'z'};
            default -> new char[]{};
        };

    }

    public static void letterCombinations(String digits, String ans, ArrayList<String> res) {
        if (digits.isEmpty()) {
            if (!ans.isEmpty()) res.add(ans);
            return;
        }
        char[] alpha = getchars(digits.charAt(0) - '0');
        for (char c : alpha) {
            letterCombinations(digits.substring(1), ans + c, res);

        }
    }

}
