import java.util.ArrayList;
import java.util.List;

public class Buddy_Strings_859 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diff.add(i);
            }
        }
        return diff.size() == 2 && s.charAt(diff.get(0)) == goal.charAt(diff.get(1)) && s.charAt(diff.get(1)) == goal.charAt(diff.getFirst());
    }
}
