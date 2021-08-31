// Spiral Matrix


// Time Complexity : O(m*n) 
// Space Complexity : O(1) // we only consider auxillary data structures 
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : Last element was repeating, fixed the case


// Your code here along with comments explaining your approach

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size(), n = matrix[0].size();
        int top = 0, left = 0, right = n-1, bottom = m-1;   // 4 borders
        vector<int> result;

        // traverse the borders first and adjust them accordingly
        while(top <= bottom && left <= right)
        {
    
            for(int i = left;i<=right; i++)
            {
                result.push_back(matrix[top][i]);   // traverse the first row
            }
            top++;
            if(top<=bottom){
                for(int i= top; i<=bottom;i++)
                {
                    result.push_back(matrix[i][right]); // traverse the last column
                }
                right--;
            }
            if(top<=bottom){
                for(int i=right; i>=left; i--)
                {
                    result.push_back(matrix[bottom][i]);   // traverse the last row
                }
                bottom--;
            }
            if(top<=bottom && left<=right){
                for(int i =bottom; i>=top; i--)
                {
                    result.push_back(matrix[i][left]);  // last column
                }
                left++;
            }
            // We adjust the boundaries after each step, important to get the right condition to prevent problems.
            
        }
        return result;  // return resultant array
    }
};


// int main(){
    
//     return 0;
// }