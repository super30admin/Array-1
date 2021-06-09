// Time Complexity : O(n^2) or O(m x n)
// Space Complexity : O(1) no extra space used result array isn't counted
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Spiral Matrix

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> result;
        
        int top = 0;
        int left = 0;
        int right = matrix[0].size() - 1;
        int bottom = matrix.size() - 1;
        int total = matrix[0].size() * matrix.size();
        
        while( left <= right && top <= bottom){
            for(int j = left; j <= right; j++){
                result.push_back(matrix[top][j]);
            }
            top++;
            
            for(int i = top; i <= bottom; i++){
                result.push_back(matrix[i][right]);
            }
            right--;
            
            for(int j = right; j >= left; j--){
                result.push_back(matrix[bottom][j]);
            }
            bottom--;
            
            for(int i = bottom; i >= top; i--){
                result.push_back(matrix[i][left]);
            }
            left++;
        }
        
        for(int i = result.size(); i > total; i--){         // checked if result == size, if greater then pop the extra traversals, done to avoid adding checks in while loop
            result.pop_back();
        }

        return result;
    }
};