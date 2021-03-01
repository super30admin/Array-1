class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // Check if array is empty
        if(nums == null || nums.length == 0) return new int[]{-1,-1};
        int length = nums.length -1;
        int[] result = new int[nums.length];
        int runningProduct = 1 ; 
        result[0] = 1;
        // calculate left product
        for(int i =1 ; i <= length ; i++){
            runningProduct = runningProduct*nums[i-1];
            result[i] = runningProduct;
        }
        runningProduct = 1;
        // calculate right product
        for(int i = length-1 ; i>=0 ; i--){
            runningProduct = runningProduct * nums[i+1];
            result[i] = result[i]*runningProduct;
        }
        return result;
    }
}

// Time Complexity O(n) , Space Complexity O(1) as we are not using any auxillary data structures
