// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
                
        // initialize answer array
        int [] answer = new int [nums.length];
        
        //Initialize index 0 of answer array as 1
        answer[0] = 1;
        
        // intialize running product = 1 for left pass
        int rp = 1;

        // left pass
        // store the running product for each element on its left side and store it in answer array
        for(int i = 1; i < nums.length; i++){
            rp = rp * nums[i - 1];
            answer[i] = rp;
        }
        
        // right pass
        // calculate the running product for each element on its right side
        // multiply this running product with previously stored answer array
        rp = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            rp = rp * nums[i + 1];
            answer[i] *=  rp;
        }
        return answer;
    }
}