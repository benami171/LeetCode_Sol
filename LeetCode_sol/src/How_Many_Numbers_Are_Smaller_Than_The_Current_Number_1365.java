class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[101];
        int[] ans = new int[nums.length];

        for ( int i = 0 ; i < nums.length ; i ++) {
            bucket[nums[i]]++;
        }
        for (int i = 1 ; i <= 100; i++) {
            bucket[i] += bucket[i-1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                ans[i] = 0;
            else
                ans[i] = bucket[nums[i] - 1];
        }
        return ans;
    }
}