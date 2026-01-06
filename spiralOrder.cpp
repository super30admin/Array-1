 class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
        int m = matrix.size();
        int n = matrix[0].size();
        // top    → first row not yet printed
        // bottom → last row not yet printed
        // left   → first column not yet printed
        // right  → last column not yet printed
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        vector<int> result;
        while (top <= bottom && left <= right) {

            // move left → right on the top row
            for (int i = left; i <= right; i++) {
                result.push_back(matrix[top][i]);
            }
            // top row is fully used, so move top boundary down
            top++;

            // move top → bottom on the right column
            for (int i = top; i <= bottom; i++) {
                result.push_back(matrix[i][right]);
            }
            // right column is done, so move right boundary left
            right--;

            // move right → left on the bottom row
            // only if there are still rows left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.push_back(matrix[bottom][i]);
                }
                // bottom row is done, move bottom boundary up
                bottom--;
            }

            // move bottom → top on the left column
            // only if there are still columns left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.push_back(matrix[i][left]);
                }
                // left column is done, move left boundary right
                left++;
            }
        }
        return result;
    }
};
