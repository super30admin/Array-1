// Time Complexity : O(n)
// Space Complexity :   O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach  : Two for loops for calc sum from start to end and vice versa, then multiplying them to get result.

class problem-1 {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(i == 0){
                left[i] = 1;
            }
            else{
                left[i] = left[i-1] * nums[i-1];
            }
        }

        for(int i=nums.length - 1; i>-1; i--){
            if(i == nums.length - 1){
                right[i] = 1;
            }
            else{
                right[i] = right[i+1] * nums[i+1];
            }
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = left[i] * right[i];
        }
        return nums;
    }
}