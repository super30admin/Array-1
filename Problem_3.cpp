/*
 * Time Complexity : O(n*m)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
*/

#include <vector>

class Solution {
public:
    std::vector<int> spiralOrder(std::vector<std::vector<int>>& matrix) {
        std::vector<int> output;
        int t = 0, b = matrix.size() - 1, l = 0, r = matrix[0].size() - 1;
        int i = 0;
        int direction = 0; // 0 -> right | 1 -> down | 2 -> left | 3 -> top

        while (t <= b && l <= r) {
            if (direction == 0) { // 0 -> right
                for (i = l; i <= r; i++) {
                    output.push_back(matrix[t][i]);
                }
                direction = 1;
                t++;
            } else if (direction == 1) { // 1 -> down
                for (i = t; i <= b; i++) {
                    output.push_back(matrix[i][r]);
                }
                direction = 2;
                r--;
            } else if (direction == 2) { // 2 -> left
                for (i = r; i >= l; i--) {
                    output.push_back(matrix[b][i]);
                }
                direction = 3;
                b--;
            } else if (direction == 3) { // 3 -> top
                for (i = b; i >= t; i--) {
                    output.push_back(matrix[i][l]);
                }
                direction = 0;
                l++;
            }
        }
        return output;
    }
};