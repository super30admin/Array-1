class Solution {
    /*
    Time complexity: O(2n) = O(n)
    Space complexity: O(1)
    */
    public int[] productExceptSelf(int[] nums) {
        // check if the nums array is empty or not
        if (nums == null || nums.length == 0){
            return new int[0];
        }
        int n = nums.length;
        int[] output = new int[n];
        // initiallly the products will be 1
        int prod_left = 1;
        int prod_right = 1;
        
        // calculate the left product
        for(int i = 0; i < n; i++){
            output[i] = prod_left;
            prod_left *= nums[i];
        }
        
        // calculate the right product and update it in the output array
        for(int i = n-1; i >= 0; i--){
            
            output[i] *= prod_right;
            prod_right *= nums[i];
        }
        
        // return the output array
        return output;
    }
}