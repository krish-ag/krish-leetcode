class Solution {
    public String smallestNumber(String DI) {
        Stack<Integer> stack = new Stack<>();
        int count = 1;
        int[] arr = new int[DI.length() + 1];
        for (int i = 0; i <= DI.length(); i++) {
            if (i == DI.length() || DI.charAt(i) == 'I') {
                arr[i] = count;
                count++;
                while (!stack.isEmpty()) {
                    arr[stack.pop()] = count;
                    count++;
                }
            }

            else {
                stack.push(i);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i: arr) {
            builder.append(i);
        }
        return builder.toString();
    }
}