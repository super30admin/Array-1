//Time Complexity O(numberOfCoins*amount)
//Space Complexity O(numberOfCoins*amount)

// Problem successfully compiled on leetcode
// No Problems faced while figuring out the logic

#include<vector>
#include<iostream>
using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> products;
        
        int leftSum=1;
        
        for(int i=0;i<nums.size();i++)
        {
            if(i>0)
            {
                leftSum=leftSum*nums[i-1];
            }
            products.push_back(leftSum);
        }
        
        int rightSum=1;
        
        for(int i=nums.size()-1;i>=0;i--)
        {
            if(i<nums.size()-1)
            {
                rightSum=rightSum*nums[i+1];
            }
            products[i]=products[i]*rightSum;
        }
        return products;
    }
};