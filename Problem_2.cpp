/*
 * Time Complexity : O(n*m)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
*/

#include <vector>

class Solution {
public:
    std::vector<int> findDiagonalOrder(std::vector<std::vector<int>>& mat) {
        if (mat.empty()) return {};
        int n =  mat.size();
        int m = mat[0].size();
        std::vector<int> result(n * m);

        int i = 0, j = 0;
        bool dir = true; // true -> up direction && false -> down direction
        for (int idx = 0; idx < n * m; idx++) {
            result[idx] = mat[i][j];
            if (dir) { // moving up
                if (j == m - 1) { i++; dir = false; }    // last column, move down
                else if (i == 0) { j++; dir = false; }   // first row, move down
                else { i--; j++; }                       // general case, move up
            } else { // moving down
                if (i == n - 1) { j++; dir = true; }     // last row, move up
                else if (j == 0) { i++; dir = true; }    // first column, move up
                else { i++; j--; }                       // general case, move down
            }
        }

        return result;
    }
};