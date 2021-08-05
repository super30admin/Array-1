// Time Complexity : O(MN)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        if(matrix.empty() || matrix.size() == 0){
            vector<int> x;
            return x;
        }
        int m = matrix.size();
        int n = matrix[0].size();
        int top=0, left=0;
        int bottom = m-1, right = n-1;
        vector<int> arr;
        while(top <= bottom && left <= right){
            //from left to right
            for(int i = left; i <= right; i++){
                arr.push_back(matrix[top][i]);
            }
            top++;

            //top to bottom
            for(int i = top; i <= bottom; i++){
                arr.push_back(matrix[i][right]);
            }
            right--;
            
            //right to left
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    arr.push_back(matrix[bottom][i]);
                }
                bottom--;
            }
            
            //bottom to top
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    arr.push_back(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
};
