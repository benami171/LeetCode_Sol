class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for ( int i = 0 ; i < words.length ; i ++){
            if(isPalindrome(words[i])){
                ans = words[i];
                break;
            }
        }
        return ans;
    }


    public boolean isPalindrome(String s){
        int n = s.length();
        for ( int i = 0 ; i < n; i++){
            if (s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;

    }
}