// Time Complexity                              :  O(N * M), where N is the row size and M is the column size of the matrix
// Space Complexity                             :  O(1)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  


class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
        int n = matrix.size();
        int m = matrix[0].size();
        
        int top = 0;
        int down = n - 1;
        int left = 0;
        int right = m - 1;
        
        vector<int> ans;
        int index = 0;
        while(left <= right and top <= down) {
            
            // first travserse left-right and capture row elements in ans array.
            for(int j=left;j<=right;j++) {
                ans.push_back(matrix[top][j]);
            }
            // move to the next row since this row has been captured.
            top++;

            
            // change direction to top-down to capture the column elements in the ans array.
            for(int i=top;i<=down;i++) {
                ans.push_back(matrix[i][right]);
            }
            // move to the next column from right column since this column is captured.
            right--;
            
            // again change direction to right-left and capture all the elements in the ans array.
            if(top <= down) {
                for(int j=right;j>=left;j--){
                    ans.push_back(matrix[down][j]);
                }
                // move to a row above since it has been captured.
                down--;
            }
            
            // again change direction to down-top and capture all the elements in the ans array.
            if(left <= right) {
                for(int i=down;i>=top;i--){
                    ans.push_back(matrix[i][left]);
                }
                // move to the next column right column to the current one since we have captured this column.
                left++;
            }
        
        }    
        
        return ans;
        
    }
        
};