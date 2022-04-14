//time complexity : o(m*n)
//space : o(m*n)
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        
        int dir = 1 ;
        int m = mat.size();
        int n = mat[0].size();
        
        int r = 0;
        int c = 0;
        int index = 0;
        vector<int> result(m*n);
        
        while(index <m*n) {
               result[index] = mat[r][c];
               index++;
           if(dir == 1) {
            if(c == n-1) {
                r++;
                dir = -1;
            } else if(r == 0) {
                c++;
                dir = -1;
            } else {
                r--;
                c++;
            }
            
        } else {
            if(r == m-1) {
                c++;
                dir = 1;
            } else if(c == 0) {
                r++;
                dir = 1;
            } else {
                r++;
                c--;
            }
        }
            
        }
        
        return result;
    }
};