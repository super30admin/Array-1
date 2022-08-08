// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

// in this program, we can count the left running sum and right running sum.
// and by multipling corresponding values of both sum, we can find the product except self.

class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return null;

        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        int runningProduct = 1;

        for(int i = 0; i<n-1; i++){
            runningProduct *= nums[i];
            result[i+1] = runningProduct;
        }

        runningProduct = 1;

        for(int i = n-1; i>0; i--){
            runningProduct *= nums[i];
            result[i-1] *= runningProduct;
        }

        return result;

    }
}