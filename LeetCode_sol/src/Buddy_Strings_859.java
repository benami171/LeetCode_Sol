public class Buddy_Strings_859 {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        for (int i = 0 ; i < A.length() ; i++){
            if (A.charAt(i) != B.charAt(i)) {
                if (i == A.length() - 1) return false;
                for (int j = i+1 ; j < A.length() ; j++){
                    if(A.charAt(j) != B.charAt(j)) {
                        char temp = A.

                    }
                }
            }
        }
    }
}
