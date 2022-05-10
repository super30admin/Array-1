// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Doing running product technique from initial index to last and the other way from the calculated array would give us the end result

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int runningProduct = 1;
        // running Proudct is kept to trace the product of values till before curr index
        for(int i=1;i<nums.length;i++) {
            answer[i-1] = runningProduct;
            runningProduct *= nums[i-1];
        }
        // product for last pos is already here
        answer[nums.length -1] = runningProduct;
        runningProduct = 1;
        // doing running product from right to left in the answer array
        for(int i=nums.length - 1;i>=0;i--) {
            answer[i] *= runningProduct;
            runningProduct *= nums[i];
        }
        return answer;
    }
}