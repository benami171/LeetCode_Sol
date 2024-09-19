import java.util.ArrayList;
import java.util.List;

public class Buddy_Strings_859 {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        List<Integer> diffIndexes = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diffIndexes.add(i);
            }
            if (diffIndexes.size() == 2){
                if ( A.charAt(diffIndexes.get(0)) == B.charAt(diffIndexes.get(1)) && A.charAt(diffIndexes.get(1) == B.charAt(diffIndexes.getFirst())){

                }
                // aaab  aggb
                // aafb  agab
                // 1,2
            }

        }
        return true;
    }
}
