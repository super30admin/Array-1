// Time Complexity : O(N) where N is number of elements in the array.
// Space Complexity : O(1) since as per the problem statement do not consider the space taken by output array

// Approach:
//     Create a Left array and calculate the running product from left such that the Left[0] = 1.
//     At any index i, Left[i] = RunningProduct(i-1) * nums[i-1]
//     Intead of creating the Right array to calculate the running product from right, do modification in existing array only.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // Edge Condition
        if(nums == null || nums.length<1) return new int[]{};
        
        // Output Array
        int[] L = new int[nums.length];
        
        // Left Running Product
        int left = 1;
        
        // Right Running Product
        int right = 1;

        // Left Running sum will be 1 initially
        L[0] = 1;

        for(int i = 1; i<L.length; i++){
            left = left * nums[i-1];
            L[i] = left;
        }
        
        // int[] R = new int[nums.length];
        // R[nums.length-1] = 1;

        int temp = nums[nums.length-1];
        nums[nums.length-1] = 1;

        for(int i = nums.length - 2 ; i>=0; i--){
            right = right * temp;
            temp = nums[i];
            nums[i] = right;
        }
        
        for(int i =0; i<nums.length;i++){
            L[i] *= nums[i];
        }
        
        return L;
    }
}