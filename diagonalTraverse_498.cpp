// Time Complexity : O(MN)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        if(mat.empty() || mat.size() == 0){
            vector<int> x;
            return x;
        }
        int r=0, c=0, i=0,dir=1;
        int m = mat.size();
        int n = mat[0].size();
        vector<int> arr(m*n);
        while(i < m*n){
            arr[i] = mat[r][c];
            if(dir == 1 ){
                if(c == n-1){
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
            else{
                if(r == m-1){
                    c++;
                    dir = 1;
                }
                else if(c == 0){
                    r++;
                    dir = 1;
                }
                else{
                    c--;
                    r++;
                }
            }
            i++;
        }
        return arr;
    }
};
