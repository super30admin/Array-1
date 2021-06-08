// Problem 1
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes 
// Three line explanation of solution in plain english
// finding right and left sum of the element 
// use 2 loops to compute left and right sum  and used the result array to maintain O(1) space complexity 

#include<iostream>
#include<vector>
#include<string>
#include<unordered_map>
#include <bits/stdc++.h>
#include<math.h>

using namespace std;


class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) 
    {
        
        int prod=1;
        int rightprod=1;

        vector<int> temp;

        for(int i=0;i<nums.size();i++)
        {
           temp.push_back(prod);
           prod=prod*nums[i];

        }

        for(int i=nums.size()-1;i>=0;i--)
        {
            temp[i]=rightprod*temp[i];
            rightprod=rightprod*nums[i]; 

        }

        return temp;
    }
};
