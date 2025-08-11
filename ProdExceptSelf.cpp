#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
First, we do a left-to-right pass storing running products before each index.
Then, we do a right-to-left pass multiplying the existing results with right-side products.
This way, each element gets the product of all other elements without using division
*/
class Solution{
public:
    //TC: O(n), SC: O(1)
    vector<int> productExceptSelf(vector<int>& nums){
        int n = nums.size();
        vector<int> result(n,1);

        int left=1;
        for(int i=0;i<n;i++){
            result[i]*=left;
            left*=nums[i];
        }

        int right = 1;
        for(int i=n-1;i>=0;i--){
            result[i]*=right;
            right*=nums[i];
        }
        return result;

    }
};
