class Problem1 {
    public int[] productExceptSelf(int[] nums) {
        // int[] left = new int[nums.length];
        // int[] right = new int[nums.length];
        int[] rp = new int[nums.length];
        // null check
        if(nums == null || nums.length == 0){
            return nums;
        }

        //Traverse and fill left
        for(int i = 0; i < nums.length; i++){
            if(i==0){
                rp[i] = 1;
            }
            else{
                rp[i] = rp[i-1] * nums[i-1];
            }
        }
        int runningProduct = 1;
        //Traverse and fill right
        for(int i = nums.length-2; i >= 0; i--){
            // if(i==nums.length-1){
            //     continue;
            // }
            //else{
            runningProduct *= nums[i+1];
            rp[i] *= runningProduct;
            //}
        }
        // for(int i = 0; i<nums.length; i++){
        //     nums[i] = left[i]*right[i];
        // }
        return rp;
    }
}