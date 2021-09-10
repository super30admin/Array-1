// Time Complexity :O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        vector<int> result;
        if(mat.size() == 0) return result;
        int i = 0, j = 0;
        int dir = 1;
        while (i < mat.size() && j < mat[0].size())
        {
            result.push_back(mat[i][j]);
            if (dir == 1)
            {
                if(i == 0 && j < mat[0].size() - 1) 
                {
                    j = j + 1; 
                    dir = -1;
                }
                else if(j == mat[0].size() - 1 && i < mat.size() - 1)
                {
                    i = i + 1;
                    dir = -1;
                }
                else 
                {
                    i = i - 1;
                    j = j + 1;
                }
            }
            else
            {
                if(j == 0 && i < mat.size() - 1)
                {
                    i = i + 1;
                    dir = 1;
                }
                else if(i == mat.size() - 1 && j < mat[0].size() - 1)
                {
                    j = j + 1;
                    dir = 1;
                }
                else
                {
                    i = i + 1;
                    j = j - 1;
                }
             }
        }
        return result;
    }
};
