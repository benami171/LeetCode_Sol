class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        return ((nums[size-1]*nums[size-2]) - ( nums[0]*nums[1])) ;
    }
}