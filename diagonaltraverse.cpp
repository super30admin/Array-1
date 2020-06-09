// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        if(matrix.empty())
            return {};
        int m=matrix.size();
        int n=matrix[0].size();
        vector<int>result(m*n);
        int i=0,r=0,c=0;  int dir=1; //Upward direction
        while(i < m*n){
            result[i] = matrix[r][c];
            if(dir == 1){
                if(c == n-1){
                    r++;
                    dir = -1;
                }else if(r == 0){
                    c++;dir = -1;
                    
                }else{
                    r--;c++;
                }
                
            }else{
                if(r == m-1){
                    c++;
                    dir = 1;
                }else if(c == 0){
                    r++;dir = 1;
                    
                }else{
                    c--;r++;
                }
                
                
            }
            i++;
        }
        return result;
    }
};