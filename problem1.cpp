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