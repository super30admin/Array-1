// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/* Maintain 4 variables: top, bottom, right, left.
 * Repeat following steps until the left pointer crosses the right pointer or bottom pointer crosses the top pointer.
 * top variable : Print top row elements from left to right. After top row elements are printed increment top pointer.
 * right variable : Print right column elements from top to bottom. After right column elements are printed decrement right pointer.
 * bottom variable :  Print bottom row elements from right to left. After bottom row elements are printed decrement bottom pointer.
 * left varible : Print left column elements from bottom to top. After left column elements are printed increment left pointer.
 */

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> result;
        int top, bottom, left, right;
        
        top = left = 0;
        bottom = matrix.size() - 1;
        right = matrix[0].size() - 1;
        
        while(left <= right && bottom >= top)
        {
            for (int i = left; i <= right; i++)
            {
                result.push_back(matrix[top][i]);   
            }
            top++;
            
            for (int i = top; i <= bottom; i++)
            {
                result.push_back(matrix[i][right]);
            }
            right--;
            
            if(bottom >= top)
            {
                for (int i = right; i >= left; i--)
                {
                    result.push_back(matrix[bottom][i]);
                }
            }
            bottom--;
            
            if (left <= right)
            {
                for (int i = bottom; i >= top; i--)
                {
                    result.push_back(matrix[i][left]);
                }
            }
            left++;
            
        }
        return result;
    } 
};