class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> ans = new ArrayList<>();

        for ( int i = 0 ; i < nums.length-1 ; i ++ ) {
            for ( int j = 0  ; j < nums.length-i-1 ; j ++ ) {
                if (nums[j] > nums[j+1] ){
                    swap(nums,j,j+1);
                }
            }
        }

        for( int i = 0 ; i < nums.length ; i ++ ){
            if ( nums[i] == target){
                ans.add(i);
            }
        }
        return ans;
    }

    private static void swap (int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
