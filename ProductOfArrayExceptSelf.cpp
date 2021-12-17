// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/* The result for ith element is the product of all of its left element and product of its all right element.
 *
 * Create result array. Traverse the input array and store the product of all of left elements for ith element in result array.
 * In second step traverse the result and input array from the right side and create a variable to store running product of right side elements and 
 * update the results array by multiplying current result array element with current value of running product variable.
 * Return the result array.  
 */


class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        if (nums.size() == 0)
            return {};
        
        vector<int> result(nums.size());
        
        int rp = 1;
        for (int i = 0; i < nums.size(); i++)
        {
            result[i] = rp;
            rp *= nums[i]; 
        }
        
        rp = 1;
        for (int i = nums.size() - 1; i >= 0; i--)
        {
            result[i] *= rp;
            rp *= nums[i];
        }
        return result;
    }
};