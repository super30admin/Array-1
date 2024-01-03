//Time complexity = O(m*n)
//Space Complexity = O(m*n)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english:
//This code implements a spiral order traversal of a given matrix, filling a vector with the elements in the order of top row, right column, bottom row, and left column. 
//It uses four pointers to track the boundaries of the current traversal, updating them as elements are processed. 
//The traversal continues until the boundaries converge, and the resulting vector contains the matrix elements in spiral order.

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int m = matrix[0].size();
        int left = 0, right = m-1;
        int top = 0, bottom = n-1;

        vector<int>ans;

        while(top<=bottom && left<=right)
        {
            for(int i = left ; i<=right ;i++)
            {
                ans.push_back(matrix[top][i]);
            }
            top++;

            for(int i = top; i<=bottom;i++)
            {
                ans.push_back(matrix[i][right]);
            }
            right--;

            if(top<=bottom)
            {
                for(int i = right; i>=left;i--)
                {
                    ans.push_back(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right)
            {
                for(int i = bottom; i>=top; i--)
                {
                    ans.push_back(matrix[i][left]);
                }
                left++;
            }

        }
        return ans;
    }
};