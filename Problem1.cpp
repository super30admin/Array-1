// Time Complexity : O(n)
// Space Complexity : O(1) no extra space used result array isn't counted
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Product of array except self

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        //[1, 2, 3, 4]
        //[24, 12, 8, 6]
        vector<int> result;
        result.push_back(1);    //[1]
        int prod = 1;
        for(int i = 0; i < nums.size() - 1; i++){
            prod = prod * nums[i];
            result.push_back(prod);         // result array [1, 1, 2, 6]
        }

        prod = 1; //resetting prod
        for(int i = nums.size() - 1; i >= 0; i--){
            result[i] = result[i] * prod;
            prod = prod * nums[i];
        }

        return result;
    }
};