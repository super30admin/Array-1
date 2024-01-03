// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// Idea is to keep shrinking top/bottom/left/right as we traverse the matrix.
// first we traverse from left to right, incrementing top and then go from top to bottom followed by decrementing right.
// if top and bottom and not crossed, then we go from right to left followed by decrementing bottom. 
// if left and right not crossed, then we go from bottom to up folowed by incrementing left. 

// Your code here along with comments explaining your approach

#include <vector>

class Solution {
public:
    std::vector<int> spiralOrder(std::vector<std::vector<int>>& matrix) {
        int top = 0, bottom = matrix.size()-1, left = 0, right = matrix[0].size()-1;
        std::vector<int> result;

        while((top <= bottom) && (left <= right))
        {
            // top row, left to right
            for(int i = left; i <= right; i++)
            {
                result.push_back(matrix[top][i]);
            }
            top++;

            //right most column, top to bottom
            for(int i = top; i <= bottom; i++)
            {
                result.push_back(matrix[i][right]);
            }
            right--;

            if(top <= bottom)
            {
                // bottom row, right to left
                for(int i = right; i>= left; i--)
                {
                    result.push_back(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right)
            {
                // left column, bottom to top
                for(int i = bottom; i >= top; i--)
                {
                    result.push_back(matrix[i][left]);
                }
                left++;
            }

        }
        return result;
    }
};·