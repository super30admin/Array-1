// Time Complexity                              :  O(N)
// Space Complexity                             :  O(1)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  


class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> left(n,1);
        
        // keep a running product of the elements in the nums array from left to right skipping the first element.
        for(int i=1;i<n;i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        
        int r = 1;
        // the variable r will store the running product from right to left which is multiplied to the 
        // corresponding element of the left array.
        for(int i=n-2;i>=0;i--) {
            r = r * nums[i+1];
            left[i] *= r;
        }
        
        return left;
    }
};