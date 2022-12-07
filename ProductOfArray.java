// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english No

// Your code here along with comments explaining your approach - taking running product from left and right and multiplying it.

class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int rProd =1;
        int[] result = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if (i-1 >=0 ) rProd *= nums[i-1];
            result[i]= rProd;
        }
        rProd = 1;
        for (int i=nums.length-1; i>=0 ;i--){
            if (i <= nums.length -2) rProd *= nums[i+1];
            result[i] *= rProd;
        }
        return result;
    }
}