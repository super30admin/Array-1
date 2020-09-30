// Time Complexity : O(N) where N is the number of elements
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> answer;
        int left = 0;
        int top = 0;
        int bottom = matrix.size()-1;
        if (bottom==-1)
            return answer;
        int right = matrix[0].size()-1;
        
        //this loop runs till the left corrdinate is lesser than the right coordinate and the top is less than or equal to the right coordinate
        while (left<=right && top<=bottom) {
            //top horizontal
            for (int i=left;i<=right;i++) {
                answer.push_back(matrix[top][i]);
            }
            top++;
            
            //right column
            for (int i=top;i<=bottom;i++) {
                answer.push_back(matrix[i][right]);
            }
            right--;
            
            //bottom horizontal
            if (top<=bottom) {
                for (int i=right;i>=left;i--) {
                    answer.push_back(matrix[bottom][i]);
                }
            }
            bottom--;
            
            //left column
            if (left<=right) {
                for (int i=bottom;i>=top;i--) {
                    answer.push_back(matrix[i][left]);
                }
            }
            left++;
        }
        return answer;
    }
};