// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach



class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int prod = 1;
        int size = nums.size();
        vector<int> result(size,1);
        // we will create right & left product arrays and then do a element wide product to get the solutions.
        
        // now we will create a left side product array and save them to result vector.
        for (int i = 0; i <size ; i++){
            result[i] = prod;
            prod = prod * nums[i];
        }
        
        // as we got left side product now we will do the right side product directly into the result vector to save space for creating separate vector.
        prod = 1;
        for(int i = size -1; i >=0; i--){
            result[i] = prod*result[i];
            prod = prod*nums[i];
        }
        return result;
    }
};