// Time Complexity : O(m*n) m->number of rows n-> number of cols)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
   //Initialize rows and columns      
        int row=matrix.size();
        int col=matrix[0].size();
        vector<int> result(row*col,0);
        
        if(row ==0 || col ==0) return result;
       
        int top=0;
        int bottom=col-1;
        int left=0;
        int right=row-1;
        int k=0;

        while(top<=bottom && left <=right && k < col*row){
            
//from left to right
            for(int i=left; i<=right;i++){
                result[k]=matrix[top][i];
                k++;
            }top++;
//from top to bottom
            for(int i=top;i<=bottom;i++){
                result[k]=matrix[i][right];
                k++;
            }right--;
//from right to left
            for(int i=right;i>=left;i--){
                result[k]=matrix[bottom][i];
                k++;
            }bottom--;
//from bottom to top
            for(int i=bottom;i>=top;i--){
                result[k]=matrix[i][left];
                k++;
            }left++;
        }
         return result;                          
        
    }
};


