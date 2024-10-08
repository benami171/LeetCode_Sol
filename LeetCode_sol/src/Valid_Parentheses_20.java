import java.util.Stack;

class Valid_Parentheses_20 {
    public static boolean isValid(String s) {
        if (s.length() < 2) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
            else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
            else return false;
        }
        return stack.isEmpty();

    }

}