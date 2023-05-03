class Solution {
    //Time O(N)
    //Space O(1)
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return new int[] {};
        }
        int n = nums.length , Right_product = 1;
        int left[] = new int[n];
        left[0] = 1;
        for(int i=1 ; i<n ; i++)
        {
            left[i] = left[i-1] * nums[i-1];
        }
        for(int i = n-2 ; i>=0 ; i--)
        {
            Right_product *= nums[i+1];
            left[i] = left[i]*Right_product;
        }
        return left;
    }
}