// Time Complexity : O(M*N)

// Space Complexity : O(1)

// Did this code successfully run on Leetcode : YES

// Appoarch: Move spirally iteratively.

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        vector<int> ans;
        int left = 0,right = n-1;
        int top = 0,bottom = m-1;
        while(left<=right && top<=bottom){
            //top row
            for(int j=left;j<=right;j++){
                ans.push_back(matrix[top][j]);
            }
            top++;
            //right wall
            if(left<=right && top<=bottom){
                for(int i=top;i<=bottom;i++){
                ans.push_back(matrix[i][right]);
            }
            right--;
            //bottom row
            }
            if(left<=right && top<=bottom){
               for(int j=right;j>=left;j--){
                ans.push_back(matrix[bottom][j]);
            }
            bottom--;
            //left
            }
            if(left<=right && top<=bottom){
                for(int i=bottom;i>=top;i--){
                ans.push_back(matrix[i][left]);
            }
            left++;
            }      
        }
        return ans;
    }
};