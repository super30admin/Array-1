// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

#include <iostream>   
#include <vector>     
using namespace std;

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> ans;
        if (matrix.empty() || matrix[0].empty()) return ans;

        int rowbeg = 0, rowend = matrix.size() - 1;
        int colbeg = 0, colend = matrix[0].size() - 1;

        while (rowbeg <= rowend && colbeg <= colend) {
            // Traverse top row
            for (int i = colbeg; i <= colend; i++)
                ans.push_back(matrix[rowbeg][i]);
            rowbeg++;

            // Traverse right column
            for (int i = rowbeg; i <= rowend; i++)
                ans.push_back(matrix[i][colend]);
            colend--;

            // Traverse bottom row
            if (rowbeg <= rowend) {
                for (int i = colend; i >= colbeg; i--)
                    ans.push_back(matrix[rowend][i]);
                rowend--;
            }

            // Traverse left column
            if (colbeg <= colend) {
                for (int i = rowend; i >= rowbeg; i--)
                    ans.push_back(matrix[i][colbeg]);
                colbeg++;
            }
        }
        return ans;
    }
};
