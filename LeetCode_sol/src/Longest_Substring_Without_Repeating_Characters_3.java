import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters_3 {

    public int longest_ss_wo_repeating_Chars(String s){
        if (s.isEmpty()) return 0;

        HashSet<Character> appeared_chars = new HashSet<>();
        int max = 0;

        for (int i = 0 ; i < s.length() - 1 ; i++){
            for (int j = i ; j < s.length() ; j++) {
                appeared_chars.add(s.charAt(j));
                if (appeared_chars.contains(s.charAt(j))) {
                    max = Math.max(max,Math.abs(i-j));
                    i = j;
                }
            }
        }

        return 0;
    }
}
