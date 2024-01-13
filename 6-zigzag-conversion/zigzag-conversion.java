class Solution {
    public String convert(String s, int numRows) {
        if (s.length() < 2 || numRows < 2) return s;

        int next = 2 * numRows - 2;
        String st = "";

        for (int i = 0; i < numRows; i++) {
            int x = i;
            while (x < s.length()){
                st += s.charAt(x);
                if ((x+next - 2*i) != x && (x+next - 2*i) != x+next && (x+next -2*i) < s.length()){
                    st += s.charAt(x+next - 2*i);
                }
                x += next;

            }
        }
        return st;
        
    }
}