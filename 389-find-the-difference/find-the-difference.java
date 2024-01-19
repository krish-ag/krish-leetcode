class Solution {
    public char findTheDifference(String s, String  t) {
        for (int i = 0; i < t.length(); i++) {
            if (s.indexOf(t.charAt(i)) == -1) return t.charAt(i);
            s = s.replaceFirst(String.valueOf(t.charAt(i)), "");
            
        }
        return '0';
    }
}