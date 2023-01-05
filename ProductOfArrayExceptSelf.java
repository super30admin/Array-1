// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Approach: Traverse the array from the left and when you are at the ith index, multiply the element to the left with a runningProduct and
//store the result in the resulting array.
// Then traverse the array from righ to left, this time at the ith index, multiply the element to the right with a runningProduct. Then multiply
// the running product with the element in the resulting array and store it in the resulting array at the same position.


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int rp=1;
        
        //left pass
        result[0]=1;
        
        for(int i=1;i<nums.length;i++){
            rp *= nums[i-1];
            result[i]=rp;
        }
        
        //right pass
        rp=1;
        
        for(int i=nums.length-2;i>=0;i--){
            rp*=nums[i+1];
            result[i]=result[i]*rp;
        }
        
        return result;
    }
}