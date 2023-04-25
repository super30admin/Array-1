// Time Complexity : O(n)
// Space Complexity : O(1) as output array doesnot count as extra space.
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// we need to traverse diagonally updwards and downwards so dir =-1 dir = +1, we need to handle edges such as 
// when index of row reach end and index of column reaches end adn change direction and r, c values accordingly.


class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m = mat.size();
        int n = mat[0].size();
        vector<int>v;
        int r=0,c=0;
        int dir = 1;// + 1 for bottom to up and -1 for top to bottom
        while(v.size()< m*n )
        {
            v.push_back(mat[r][c]);
            if(dir == 1){
                if(c == n-1)
                {
                    r++;
                    dir = -1;
                }
                else if(r == 0){
                    c++;
                    dir = -1;
                }
                else{
                    r--;
                    c++;
                }
            }
            else
            {
                if(r == m-1)
                {
                    dir = 1;
                    c++;
                }
                else if(c == 0)
                {
                    r++;
                    dir = 1;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return v;
    }
};