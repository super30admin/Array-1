// Time Complexity : O(m*n) where m and n represent rows and columns
// Space Complexity : O(1) as output is not considered as extra space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
#include <vector>
using namespace std;
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int r = mat.size();
        int c = mat[0].size();
        vector<int> ans;
        int i =0,j=0;
        bool dirUp = true;
        for(int index = 0;index<r*c;index++)
        {
            ans.push_back(mat[i][j]);
            if(dirUp)
            {
                if(i==0&&j!=c-1)
                {
                    j++;
                    dirUp =false;
                }
                else if(j==c-1)
                {
                    i++;
                    dirUp =false;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else
            {
                if(j==0&&i!=r-1)
                {
                    i++;
                    dirUp =true;
                }
                else if(i==r-1)
                {
                    j++;
                    dirUp =true;
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