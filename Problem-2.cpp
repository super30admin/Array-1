// Time Complexity : O(M*N)

// Space Complexity : O(1)

// Did this code successfully run on Leetcode : YES

// Appoarch: Traversing the array with conditional up and down conditions.

#include<bits/stdc++.h>
using namespace std;

class Solution
{
public:
    vector<int> findDiagonalOrder(vector<vector<int>> &mat)
    {
        int m = mat.size();
        int n = mat[0].size();
        int i = 0, j = 0;
        bool dir = true; // up
        vector<int> ans(m * n);
        for (int idx = 0; idx < ans.size(); idx++)
        {
            ans[idx] = mat[i][j];
            if (dir)
            {
                if (i == 0 && j != n - 1)
                {
                    j++;
                    dir = false;
                }
                else if (j == n - 1)
                {
                    i++;
                    dir = false;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else // down
            {
                if (j == 0 && i != m - 1)
                {
                    i++;
                    dir = true;
                }
                else if (i == m - 1)
                {
                    j++;
                    dir = true;
                }
                else
                {
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
};