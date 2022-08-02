// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: We will need to find the running product of values to the left of a particular index and then calculate the running product to the right of the same index then add to result table.

// Your code here along with comments explaining your approach


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result= new int[n];
        if(nums==null || nums.length==0) return result;
        
        int rp=1;
        
        result[0]=1;
        // left pass
        for(int i=1; i<n; i++){
            rp=rp*nums[i-1];
            result[i]=rp;
        }
        //right pass
        rp=1;
        for(int i=n-2; i>=0; i--){
            rp=rp*nums[i+1];
            result[i]*=rp;
        }
        return result;
    }
}