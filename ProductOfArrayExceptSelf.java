//Time Complexity: O(n)
//Space Complexity: O(n)
//Approach: Find running product for both left pass and right pass and add product of these two into the final result to get the
//product of all of the number except self
class Solution {
    public int[] productExceptSelf(int[] nums)
    {
        int n = nums.length;

        //Validate the inputs
        if (nums == null || nums.length == 0) return new int[n];

        int[] rProduct = new int[n];
        int[] lProduct = new int[n];
        lProduct[0] = 1;
        rProduct[n-1] = 1;
        int runProduct = 1;

        //Right pass to find running product from left to right
        for(int i=1; i < n; i++)
        {
            runProduct = nums[i-1] * runProduct;
            lProduct[i] = runProduct;
        }

        //Reset running product befor right pass
        runProduct = 1;

        //Left pass to find running product from right to left
        for(int i=n-2; i >= 0; i--)
        {
            runProduct = nums[i+1] * runProduct;
            rProduct[i] = runProduct;
        }

        //Add right product * left product in original array
        for(int i = 0; i < n; i++)
        {
            nums[i] = rProduct[i] * lProduct[i];
        }

        return nums;
    }
}