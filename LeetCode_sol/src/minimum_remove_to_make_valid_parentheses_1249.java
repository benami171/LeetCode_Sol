public class minimum_remove_to_make_valid_parentheses_1249 {
    public String min_rem_val_paren(String s){
        StringBuilder sb = new StringBuilder();
        int open_p = 0;
        for (char c: s.toCharArray()){
            if ( c == '(') {
                open_p++;
            } else if (c == ')') {
                if(open_p == 0) continue;
                open_p--;
            }
            sb.append(c);
        }

        StringBuilder resString = new StringBuilder();
        for (int i = sb.length()-1 ; i >= 0 ; i--) {
            if(sb.charAt(i) == '(' && open_p-->0) continue;
            resString.append(sb.charAt(i));
        }
        return resString.reverse().toString();
    }
}
