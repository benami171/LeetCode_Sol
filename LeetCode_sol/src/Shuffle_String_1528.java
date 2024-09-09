class Shuffle_String_1528 {
    public String restoreString(String s, int[] indices) {
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            ans.setCharAt(indices[i],s.charAt(i));
        }
        return ans.toString();
    }
}