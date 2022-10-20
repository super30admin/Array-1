/*
Time Complexity: O(m*n)
Space Complexity: O(m*n)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m = mat.size(), n = mat[0].size();
        vector<int> ans;
        int j = 0, i = 0;
        int res = 0;
        int dir = 0;//0 up, 1 down
        while(res<m*n){
                ans.push_back(mat[i][j]);
                res++;
                if(dir==0){//up
                    if(j==n-1){
                        dir=1;
                        i++;
                    } else if(i==0){
                        dir=1;
                        j++;
                    } else{
                        i--;
                        j++;
                    }
                } else {
                    if(i==m-1){
                        dir=0;
                        j++;
                    } else if(j==0){
                        dir=0;
                        i++;
                    } else{
                        i++;
                        j--;
                    }
                }
            }
        return ans;
    }
};