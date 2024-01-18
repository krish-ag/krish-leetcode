class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder str = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        str = getStringBuilder(s, str);

        str2 = getStringBuilder(t, str2);
        return str.toString().contentEquals(str2);
    }

    private static StringBuilder getStringBuilder(String t, StringBuilder str2) {
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!str2.isEmpty()) {
                    str2 = new StringBuilder(str2.substring(0, str2.length() - 1));
                }
            } else {
                str2.append(t.charAt(i));
            }
        }
        return str2;
    }
}