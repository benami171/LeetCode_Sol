class Remove_All_Adjacent_Duplicates_in_String_1047 {
    public static String removeDuplicates(String s) {
        char[] ans = s.toCharArray();
        int length = s.length();
        int i = 0;

        for (int j=0 ; j < length; j++,i++) {
            ans[i] = ans[j];
            if (i > 0 && ans[i] == ans[i -1]){
                i = i - 2;
            }
        }
        return new String(ans,0,i);
    }
}