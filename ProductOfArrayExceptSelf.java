//Time Complexity: O(N)
//Space COmplexity: O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int productLeft = 1;
        int productRight = 1;

        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = productLeft;
            productLeft *= nums[i];
        }

        for(int i = nums.length - 1; i >= 0; i--)
        {
            ans[i] *= productRight;
            productRight *= nums[i];
        }
        return ans;

    }
}