class Solution {
    // "sdfasdf sdfadf asdfasf"
    // [asdfsadf,asdfasdf,asdfasdf]
    //
    public String reverseWords(String s) {
        String result = "";
        String[] words = s.split(" ");
        for ( int i = 0 ; i < words.length ; i++){
            result += reverseWord(words[i]) + " ";
        }
        return result.substring(0,result.length()-1);
    }


// s = ma kore
// ans = erok am

    private String reverseWord(String s){
        String ans = "";
        for ( int i = s.length()-1 ; i >= 0 ; i--){
            ans += s.charAt(i);
        }
        return ans;
    }
}
