// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
//Explanation: This approach is when we want to get the output in O(n) time and O(1) space. A result[] is for storing
//             the elements on the left side (call it left pass). Once we calculate left pass, we declared a variable
//             runningProduct which in initialiased to 1 and we then calculate the running product from right side (i.e n-2)
//             for right pass and update the array for left pass. Hence, instead of using 2 arrays, we were able to solve it
//             using single array.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        //null check
        if(nums == null || n == 0)
            return result;

        int runningProduct = 1;
        result[0] = 1;

        //left pass
        for(int i=1; i<n; i++){
            runningProduct *= nums[i-1];
            result[i] = runningProduct;
        }

        //right pass
        runningProduct = 1;
        for(int i=n-2;i>=0;i--){
            runningProduct *= nums[i+1];
            result[i] = result[i] * runningProduct;
        }
        return result;
    }
}