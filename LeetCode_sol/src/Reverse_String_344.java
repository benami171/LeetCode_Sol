import java.util.Stack;

class Reverse_String_344 {
    public static void reverseString(char[] s) {

        Stack<Character> stack = new Stack<>();
        for ( int i = 0 ; i < s.length ; i++){
            stack.push(s[i]);
        }
        for ( int j = 0 ; j < s.length ; j++) {
            s[j] = stack.pop();
        }
    }

}