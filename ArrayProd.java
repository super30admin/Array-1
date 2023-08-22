// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// I used a single array to calculate the left product first and 
// then the right product using a running product variable.
// For the left product, I multiplied the running product by 
// the value left of i, and the opposite for the right product.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int rp = 1; //running product, set to 1
        answer[0] = 1;
        //left prod
        for(int i = 1; i <= nums.length - 1; i++){
            rp *= nums[i-1];
            answer[i] = rp;
        }
        //reset rp
        rp = 1;
        //right prod
        for(int i = nums.length-2; i >= 0; i--){
            rp *= nums[i+1];
            answer[i] *= rp;
        }
        return answer;
    }
}