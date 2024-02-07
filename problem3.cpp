// 238. 54. Spiral Matrix
// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/* 
    taking four corners of the matrix top, bottom, right, left and iterating from left to right, right to top,
    top to bottom and bottom to top in the spiral path
*/


// Your code here along with comments explaining your approach
vector<int> spiralOrder(vector<vector<int>>& mat) {
    int m = mat.size(), n = mat[0].size();
    int t = 0, b = m-1, l = 0, r = n-1, i = 0, j = 0;
    vector<int> ans;
    while(l <= r && t <= b)
    {
        for(int j = l; j <= r; j++) 
        {
            ans.push_back(mat[t][j]);
        }
        t++;
        for(int i = t; i <= b; i++)
        {
            ans.push_back(mat[i][r]);
        }
        r--;
        if(t <= b && l<=r)
        {
            for(int j = r; j >= l; j--)
            {
                ans.push_back(mat[b][j]);
            }
            b--;
            for(int i = b; i >= t; i--)
            {
                ans.push_back(mat[i][l]);
            }
            l++;
        }
    }
    return ans;
}
