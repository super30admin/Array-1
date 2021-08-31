// 238. Product of Array Except Self


// Time Complexity : O(n) 
// Space Complexity : O(1) // we only consider auxillary data structures 
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : Very confused on indexing and how we can do it within a single array. Had to refer class video again for help.


// Your code here along with comments explaining your approach

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> result(nums.size());  // initialising result array
        result[0] = 1;  
        int rp = 1;  // initializing the running product
        for(int i =1; i<nums.size(); i++)
        {
            result[i] = result[i-1] * nums[i-1];   // finding the left subarray
        }
        for(int i=nums.size() - 1; i>=1; i--)
        {
            rp *= nums[i];
            result[i-1] *=  rp;     // getting the resultant array
        }
        
        return result;
    }
};

// int main()
// {

// }