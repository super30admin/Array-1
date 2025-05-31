// Time complexity O(m*n)
// Space complexity O(1)

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        int top = 0;
        int left = 0;
        int bot = m-1;
        int right = n-1;

        vector<int> result(m*n, 0);
        int idx = 0;

        while (top <= bot && left <= right) {

          for (int c = left; c <= right; c++) {
            result[idx++] = matrix[top][c];
          }
          top++;

          for (int r = top; r <= bot; r++) {
            result[idx++] = matrix[r][right];
          }
          right--;

          if (top <= bot)
          {
            for (int c = right; c >= left; c--) {
              result[idx++] = matrix[bot][c];
            }
            bot--;
          }

          if (left <= right)
          {
            for (int r = bot; r >= top; r--) {
              result[idx++] = matrix[r][left];
            }
            left++;
          }

        }

        return result;

    }
};