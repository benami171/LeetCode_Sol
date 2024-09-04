import java.util.Arrays;

class Maximum_Product_Difference_Between_Two_Pairs_1913 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        return ((nums[size-1]*nums[size-2]) - ( nums[0]*nums[1])) ;
    }
}