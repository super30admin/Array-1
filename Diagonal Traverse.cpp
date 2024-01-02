// Diagonal Traverse

/*
Divide solution into two parts
First part: When direction is up
Second part: When direction is down
While keeping in mind of the end of matrix - first row, last row, first column, last column
Time Complexity: O(n*m)
Space Complexity: O(1)
/*

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {


        int m = mat.size();
        int n = mat[0].size();

        vector<int> ret(m * n);
        int dir = 1; // 1-up; 0-down
        int i = 0, j = 0;
        for (int idx = 0; idx < ret.size(); idx++) {
            ret[idx] = mat[i][j];
            if (dir == 1) {
                // dir up
                if (i == 0 && j != n - 1) {
                    j++;
                    dir = 0;

                } else if (j == n - 1) {
                    i++;
                    dir = 0;
                } else {
                    i--;
                    j++;
                }
            }

            else if (dir == 0) {

                // dir down
                if (j == 0 && i != m - 1) {
                    i++;
                    dir = 1;
                } else if (i == m - 1) {
                    j++;
                    dir = 1;
                } else {
                    i++;
                    j--;
                }
            }
        }

        return ret;
    }
};