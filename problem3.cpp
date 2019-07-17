// Time Complexity : O(n) --> Number of rows * no. of columns (x*y)
// Space Complexity : O(1) --> Only using the output array (which is O(n) but excluded from consideration)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Confusing edge case. Needed some practice to figure it out

// Your code here along with comments explaining your approach

/* 2 Lines Explanation of Algorithm
   Use 4 pointers (first row, last row, first column, last column) to traverse the matrix in spiral down fashion.
   Handle the case when a value is counted twice because the pointers cross each other in both the directions
       
    Tactics: 1 Array, 4 pointers. Traverse, (1) left->right (2) top->bottom (3) right->left (4) bottom->top MAJOR EDGE CASE WHEN LEFT-TOP CROSSES RIGHT-BOTTOM
*/

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int top = 0;
        int bottom = matrix.size() - 1;
        
        if(matrix.size() == 0) return vector<int>();
        
        int left = 0;
        int right = matrix[0].size() - 1;
        
        vector<int>answer;
            
        while(left <= right && top <= bottom)
        {   
            for(int i = left; i<= right; i++)
                answer.push_back(matrix[top][i]);
            top++;
            
            for(int i = top; i<=bottom; i++)
                answer.push_back(matrix[i][right]);
            right--;
            
            if(top <= bottom) //when the top pointer has moved above bottom pointer, ignore the input
            {
                for(int i = right; i>=left; i--)
                    answer.push_back(matrix[bottom][i]);
                bottom--;
                   
            }    
            
            if(left <= right) //When the left pointer has moved above right pointer, ignore the input
            {
                for(int i = bottom; i>=top; i--)
                    answer.push_back(matrix[i][left]);
                left++;    
            }
            
        }
        
        return answer;
    }
};