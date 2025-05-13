import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String_ll_1209 {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek().key == c) {
                stack.peek().value++;
                if (stack.peek().value == k) {
                    stack.pop();
                }
            } else {
                stack.push(new Pair(c, 1));
            }
        }

        StringBuilder result = new StringBuilder();
        for (Pair p : stack) {
            for (int i = 0; i < p.value; i++) {
                result.append(p.key);
            }
        }
        return result.toString();

    }

    static class Pair {

        char key;
        int value;

        public Pair(char k, int v) {
            this.key = k;
            this.value = v;
        }
    }

    public static void main(String[] args) {
        Remove_All_Adjacent_Duplicates_In_String_ll_1209 obj = new Remove_All_Adjacent_Duplicates_In_String_ll_1209();
        String result = obj.removeDuplicates("deeedbbcccbdaa", 3);
        System.out.println(result); // Output: "aa"

    }

}





