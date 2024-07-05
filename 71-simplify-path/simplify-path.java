class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack<>();
        for (String s: arr) {
            if (s.isEmpty() || s.equals(".")){
                continue;
            }
            if (s.equals("..")){
                 if (!st.isEmpty()) st.pop();
            }
            else st.push(s);


        }
        StringBuilder out = new StringBuilder();

        while (!st.empty()) {
            out.insert(0, "/" + st.pop());
        }
        String ans = out.toString();
        return ans.isEmpty() ? "/" : ans;
    }
}