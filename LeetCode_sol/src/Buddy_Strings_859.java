import java.util.ArrayList;
import java.util.List;

public class Buddy_Strings_859 {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diff.add(i);
            }
            if (diff.size() == 2){
                if ( A.charAt(diff.get(0)) == B.charAt(diff.get(1)) && A.charAt(diff.get(1)) == B.charAt(diff.getFirst())){
                    return true;
                }
            }
            if (diff.isEmpty()) {
                if(A.length() == 2 ){
                    if (A.charAt(0) == A.charAt(1)) return true;
                }
                if (A.length() > 2) {
                    return true;
                }
            }

        }
        return true;
    }
}
