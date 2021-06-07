class Solution {
public:
//TC = O(n^2)
//SC = O(1)
//reminds me of pyramid problems I feared when in 12th computer classes
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        vector<int> res;
        int i = 0, j = 0, direc = 1;
        while (1) {
            while (inRange(matrix, i, j)) {
                res.push_back(matrix[i][j]);
                i -= direc;
                j += direc;
            }
            if (direc == 1) {
                i += 1;
                if (!inRange(matrix, i, j)) {
                    i += 1; j -= 1;
                    if (!inRange(matrix, i, j)) { break; }
                }
            } else {
                j += 1;
                if (!inRange(matrix, i, j)) {
                    i -= 1; j += 1;
                    if (!inRange(matrix, i, j)) { break; }
                }
            }
            direc = -direc;
        }
        return res;
    }
    
    bool inRange(vector<vector<int>>& matrix, int i, int j) {
        return i >= 0 && i < matrix.size() && j >= 0 && j < matrix[0].size();
    }
};