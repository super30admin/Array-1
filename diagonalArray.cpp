// Time Complexity :O(m*n) where m*n in the number elements in the matrix
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int dir  = 1;
        int r = 0,c =0;
        vector<int> ans;
        int m = mat.size();
        int n = mat[0].size();
        int i = 0;
        while(i< m*n){
            ans.push_back(mat[r][c]);
            if(dir == 1){
                if(c == n-1){ //2,2
                dir = -1;
                r++;
            }
            else if(r == 0){
                dir = -1;
                c++;
            }
            else{
                c++;
                r--;
            }
            }
            else{
                if(r == m-1){
                    dir = 1;
                    c++;
                }
                else if(c == 0){
                    dir = 1;
                    r++;
                }
                else{
                    c--;
                    r++;
                }
            }
            i++;
        }
        return ans;
    }
};