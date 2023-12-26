// Time Complexity : O(n)
// Space Complexity : O(1)
// Method used : Linear Search

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;

        // When I am at an index i, result[i] will store the prefix prduct from 0 till i - 1;
        int prefix = 1, suffix = 1;

        for(int i = 1; i < n; i++)
        {
            prefix *= nums[i - 1];
            result[i] = prefix;
        }
        
        // Similarly is the case with suffix product. The suffix for last index will be 1 bcoz we don't have any element
        // there. So now keep track of suffix and multiply with already evaulated prefix.
        for(int i = n - 2; i >= 0; i--)
        {
            suffix *= nums[i + 1];
            result[i] *= suffix;
        }

        return result;
    }
}