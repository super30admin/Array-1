// Time Complexity : O(m*n) where m and n represent rows and columns
// Space Complexity : O(1) as output is not considered as extra space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
#include <vector>
using namespace std;
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {

        int top = 0;
        int right = matrix[0].size()-1;
        int bottom = matrix.size()-1;
        int left = 0;
        vector<int> result;
        int i;
        while(top<=bottom && left<=right)
        {
            i = left;
            while(i<=right)
            {
                result.push_back(matrix[top][i]);
                i++;
            }
            top++;
            i = top;
            while(i<=bottom)
            {
                result.push_back(matrix[i][right]);
                i++;
            }
            right--;
            if(top>bottom)
                break;
            i=right;
            while(i>=left)
            {
                result.push_back(matrix[bottom][i]);
                i--;
            }
            bottom--;
            i=bottom;
            if(left>right)
                break;
            while(i>=top)
            {
                result.push_back(matrix[i][left]);
                i--;
            }
            left++;
        }
        return result;
    }
};