// Problem 2=3
// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes 
// Three line explanation of solution in plain english
// maintain four pointers to print the spirals start from the largest spiral and gp inward  update the pointers appropriately after completion of each segment of spiral
// do this continously intill the pointers cross over since the base case variable is being chnged check if base case holds true inside the loop for cases where it is not implicitly checked by for loop
// return result of traversal in intger vector 


#include<iostream>
#include<vector>
#include<string>
#include<unordered_map>
#include <bits/stdc++.h>
#include<math.h>
#include<map>

using namespace std;

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        if(matrix.size()==0)
        {
            vector<int> temp={0};
            return temp;
        }
        vector<int> result;
        int m=matrix.size();int n=matrix[0].size();
        int top=0;int bottom=m-1;int left=0;int right=n-1;
        while (top<=bottom && left<=right)
        {
           //add top row
           for(int j=left;j<=right;j++)
           {
               result.push_back(matrix[top][j]);
           }
           top++;

           //right column
           for(int i=top;i<=bottom;i++)
           {
               result.push_back(matrix[i][right]);
           }
           right--;
           // bottom row;
           if(top<=bottom)
           {
                for(int j=right;j>=left;j--)
                {
                    result.push_back(matrix[bottom][j]);
                }
            bottom--;

           }
           // left column
           if(left<=right)
           {
                for(int i=bottom;i>=top;i--)
                {
                    result.push_back(matrix[i][left]);
                }
                left++;
           }
          

        }
        return result;
        

        
    }
};

