// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> result;
        if(matrix.size() == 0) return result;
        int top = 0;
        int bottom = matrix.size() - 1;
        int left = 0;
        int right = matrix[0].size() - 1;
        
        while (left <= right && top <= bottom)
        {
            for (int i = left; i <= right; i++)
            {
                result.push_back(matrix[top][i]);
            }
            top++;
            
            if (top <= bottom)
            {
                for (int i = top; i <= bottom; i++)
                {
                    result.push_back(matrix[i][right]);
                }
                right--;
            }
            
            if(left <= right && top <= bottom)
            {
                for (int i = right; i >= left; i--)
                {
                    result.push_back(matrix[bottom][i]);   
                }
                bottom--;
            }
            if (left <= right && top <= bottom)
            {
                for (int i = bottom; i >= top; i--)
                {
                    result.push_back(matrix[i][left]); 
                }
                left++;
            }
        }
        return result;
    }
};
