class Split_a_String_in_Balanced_String_1221 {
    public int balancedStringSplit(String s) {
        int rs = 0;
        int ls = 0;
        int sum =0;
        if ( s == null || s.isEmpty()){
            return 0;
        }
        for (int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            if (c == 'L'){
                ls++;
            } else {
                rs++;
            }
            if (ls == rs){
                sum++;
            }
        }
        return sum;
    }
}