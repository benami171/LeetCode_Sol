class Solution {
    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; ans.size() < n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                ans.add("Fizz");
            }
            if (i % 5 == 0 && i % 3 != 0) {
                ans.add("Buzz");
            }
            if (i%3 == 0 && i%5 == 0) {
                ans.add("FizzBuzz");
            }
            if (i%3 != 0 && i%5 != 0) {
                ans.add(String.valueOf(i));
            }
        }
        return ans;

    }
}