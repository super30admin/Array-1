// 238. Product of Array Except Self
// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/* 
Initialized variables to keep track of the current position in the matrix and the direction of traversal and iterating 
over each element in the matrix, adding it to the result vector while adjusting the position and direction based on the 
current location in the matrix.and returned the resulting vector containing the elements traversed in diagonal order.
*/


// Your code here along with comments explaining your approach
vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
    int m = mat.size(), n = mat[0].size(), i = 0, j = 0;
    vector<int> ans;
    bool dir = true;
    for(int k = 0; k < m*n; k++)
    {
        ans.push_back(mat[i][j]);
        if(dir)
        {
            if(j == n-1)
            {
                i++;
                dir = false;
            }
            else if(i == 0)
            {
                j++;
                dir = false;
            }
            else
            {
                i--;
                j++;
            }
        }
        else
        {
            if(i == m-1)
            {
                j++;
                dir = true;
            }
            else if(j == 0)
            {
                i++;
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