//TC: O(n*m) where n is number of rows, m is the number of columns
//SC: O(1)

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
       
        vector<int> result;
        
        if(matrix.size() == 0)
            return result;
        
        int top = 0;
        int left = 0;
        int right = matrix[0].size()-1;
        int bottom = matrix.size()-1;
        
        int length = matrix[0].size()*matrix.size();
        int n = 0;

        //checking bounds of the matrix
        while(top <= bottom && left <= right){
            //left->right
            for(int i=left; i<=right; i++){
                result.push_back(matrix[top][i]);
            }
            top++;
            
            //top->bottom
            for(int j = top; j<=bottom; j++){
                result.push_back(matrix[j][right]);
            }
            right--;
            
            //right->left
            if(top <= bottom && left <= right){
                for(int i=right; i>=left; i--){
                    result.push_back(matrix[bottom][i]);
                }
            }
            bottom--;

            
            //bottom->top
            if(top <= bottom && left <= right){
                for(int j=bottom; j>=top; j--){
                    result.push_back(matrix[j][left]);
                }
            }
            left++;
        }
        
        return result;
    }
};