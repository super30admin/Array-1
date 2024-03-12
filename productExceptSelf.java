// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// storing the product of elements left to the "self" element and
//then storing the product of the elements to the right of "self" element
// and then returning the product of the left and right subproducts

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int rp = 1;
        int result[] = new int[n];
        result[0] = 1;
        //left product
        for(int i = 1;i<n; i++){
            rp = rp * nums[i-1];
            result[i] = rp;
        }

        //right product
        rp = 1;
        for(int i=n-2; i>=0; i--){
            rp = rp * nums[i+1];
            result[i] = result[i] * rp;
        }
        return result;
    }
}