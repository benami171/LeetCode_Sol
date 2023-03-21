class Solution {
    public int balancedStringSplit(String s) {
        int rs = 0;
        int ls = 0;
        int sum =0;
        if ( s == null || s.length() == 0){
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