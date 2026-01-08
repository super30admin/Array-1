// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Here we move left to right keeping the track of product till the previous element
//same we can do from right to left and keep track of element till the next element
//we will multiply those to get the product
//Instead fo keeping track of right to left, we just had the rlProduct which has the value of products till next element
// we mutiply that to existing lrProduct to get answer
class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        //always the product next to 0th element 1
        int lrProduct = 1;
        ans[0] = lrProduct;
        //left to right product except self
        for(int i = 1;i<nums.length;i++)
        {
            lrProduct = nums[i-1] * lrProduct;
            ans[i] = lrProduct;
        }
        //same as before product next to right of len is 1
        int rlProduct = 1;
        //insated of having separate array, update the ans array to multply right to left product
        for(int j = nums.length-2;j>=0;j--)
        {
            rlProduct = nums[j+1]*rlProduct;
            ans[j] = ans[j] * rlProduct;
        }
        return ans;
    }
}