class Remove_Element_27 {
    
    public int removeElement(int[] nums, int val) {
        int final_size = 0;
        if (nums.length == 0) {
            return 0;
        }
        
        for ( int i = 0 ; i < nums.length ; i ++ ) {
            if ( nums[i] != val){
                nums[final_size] = nums[i];
                final_size++;
            }
        }
    
        return final_size;
    }
}
