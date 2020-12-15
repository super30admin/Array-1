// Time Complexity : O(m*n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes


class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        if(matrix.empty()) return {};
        
        int m = matrix.size();
        int n = matrix[0].size();
        vector<int> result(m*n);
        
        int i=0,j=0,index=0,dir = 1;
        
        while(index<m*n){
            result[index] = matrix[i][j];
            if(dir==1){
                if(j==n-1){
                    dir = -1;
                    i++;
                }
                else if(i==0){
                    dir = -1;
                    j++;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(i==m-1){
                    dir = 1;
                    j++;
                }
                else if(j==0){
                    dir = 1;
                    i++;
                }
                else{
                    i++;
                    j--;
                }
            }
            index++;
        }
        return result;
    }
};
