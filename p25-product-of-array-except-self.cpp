// Time Complexity : O(n) - n is the input size
// Space Complexity: O(1) - The 'res' vector is returned. So, it won't be considered as extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach:
/*
    1. Considering at index 'i', we find the product of elements which are on the
    left side of index 'i' and store them in vector
    2. Then we find product of elements which are on the right side of index 'i' and
    multiply it value in res[i]. Now, res[i] represents the product of elements except self(nums[i]).
*/
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> res;
        int runningProduct = 1;
        
        // res[i] represents the product of elements which are on it's left side
        // res[i] = nums[0]*nums[1]*...*nums[i-1]
        for(int i = 0; i < nums.size(); i++) {
            if(i != 0)
                runningProduct *= nums[i-1];
            res.push_back(runningProduct);
        }
        
        runningProduct = 1; //reset it to 1
        
        // Here, runningProduct at index 'i' represents the product of elements which are on the right side of 'i'
        // runningProduct at 'i' = nums[nums.size()-1]*nums[nums.size()-2]*...*nums[i+1]
        
        // We will be multiplying this runningProduct at 'i' with res[i] which gives
        // product of all elements except self (corresponding to nums[i]).
        for(int i = nums.size()-1; i > -1; i--) {
            if(i != nums.size()-1){
                runningProduct *= nums[i+1];
            }
            res[i] *= runningProduct;
        }
        return res;
    }
};
