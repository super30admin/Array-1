//  ## Problem 1

// Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

// Example:

// Input: [1,2,3,4]
// Output: [24,12,8,6]
// Note: Please solve it without division and in O(n).

// Follow up:
// Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)


// Time complexity: O(n)
// Space complexity: O(1) as no auxillary array
// Idea- to maintain left running product and right running product and multiply

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        
        vector<int> result(nums.size(), 0);
        int rp=1;
        
        for(int i=0; i< nums.size() ; i++){
            
            result[i] = rp;
            rp = rp* nums[i];
        }
        
        rp=1;
        for(int i= nums.size()-1; i>=0; i--){
            result[i]= result[i] * rp;
            rp = rp * nums[i];
        }
        
        return result;
    }
};