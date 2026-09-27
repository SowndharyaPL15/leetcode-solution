import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(current);
                current = new StringBuilder();
            } else if (c == ')') {
                StringBuilder last = stack.pop();
                current.reverse();
                last.append(current);
                current = last;
            } else {
                current.append(c);
            }
        }
        
        return current.toString();
    }
}