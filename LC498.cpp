// Time complexity O(m*n)
// Space complexity O(1)

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m = mat.size();
        int n = mat[0].size();
        vector<int> result(m*n, 0);
        
        int r = 0;
        int c = 0;
        bool direction = true;
        int  i = 0;
        while (r < m && c < n) {
            
            result[i] = mat[r][c];
            i++;

            if (direction) {
                if (r == 0 && c != n-1) {
                  c = c+1;
                  direction = !direction;
                } else if (c == n-1) {
                  r = r+1;
                  direction = !direction;
                } else {
                  r = r-1;
                  c = c+1;
                }
            } else {
                if (c == 0 && r != m-1) {
                    r = r+1;
                    direction = !direction;
                } else if (r == m-1) {
                    c = c+1;
                    direction = !direction;
                } else {
                  r = r+1;
                  c = c-1;
                }
            }

        }

        return result;
    }
};