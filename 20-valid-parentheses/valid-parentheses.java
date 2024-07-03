class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push('.');
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(' || x == '{' || x == '[') stack.push(x);
            else {
                if ((x == ')' && stack.peek() == '(') || (x == ']' && stack.peek() == '[') || (x == '}' && stack.peek() == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        stack.pop();
        return stack.isEmpty();
    }
}
