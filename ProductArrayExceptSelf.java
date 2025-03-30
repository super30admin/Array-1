// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach:
// Modify the result array for the left element products of the current element,
// using the same array modify for right elements products,
// giving the final result with product excluding the current element.



class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int rp=1;
        result[0]=1;
        for(int i=1;i<n;i++){
            rp*=nums[i-1];
            result[i]=rp;
        }
        rp=1;
        for(int i=n-2;i>=0;i--){
            rp*=nums[i+1];
            result[i]=rp*result[i];
        }
        return result;
    }
}