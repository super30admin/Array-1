class Solution {
public:
    //tc-O(N)
    //SC-O(1)
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int left=0;
        int right=matrix[0].size()-1;
        int top=0;
        int bottom=matrix.size()-1;
        vector<int>res;
        while(left<=right&&top<=bottom){
            //first row
            for(int i=left;i<=right&&top<=bottom;i++){
                res.push_back(matrix[top][i]);
            }
            top++;
            //last column
            for(int i=top;i<=bottom&&left<=right;i++){
                res.push_back(matrix[i][right]);
            }
            right--;
            //last row
            for(int i=right;i>=left&&top<=bottom;i--){
                res.push_back(matrix[bottom][i]);
            }
            bottom--;
            //first column
            for(int i=bottom;i>=top&&left<=right;i--){
                res.push_back(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
};