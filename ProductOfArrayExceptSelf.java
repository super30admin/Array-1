// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. Create two arrays to store prefix and suffix products.
// 2. Calculate prefix products from left to right and suffix products from right to left.
// 3. Combine the prefix and suffix products to get the final result for each element.


public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int [] from = new int[nums.length];
        int  mul = 1;
        for(int i=0;i<nums.length;i++)
        {
            from[i] = mul*nums[i];
            mul = mul*nums[i];
        }   
        int [] back = new int[nums.length];
        mul = 1;
        for(int i=nums.length-1;i>=0;i--)
        {
            back[i] = mul*nums[i];
            mul = mul*nums[i];
        }
        back[0] = back[1];
        for(int i=1;i<nums.length;i++)
        {
            if(i==nums.length-1)
            {
                back[i] = from[i-1]*1;
            }
            else
            {
                back[i] = from[i-1]*back[i+1];
            }
        }
        return back;
    }
}
