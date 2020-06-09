//Time complexity - O(n*m)
//Space complexity - O(1)
//Runs sucessfully on leetcode

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        if(matrix.empty())
            return {};
        int m=matrix.size();//row 
        int n=matrix[0].size();//column 
        vector<int>result(m*n);
        int left=0,right =n-1;
        int top=0,bottom =m-1,j=0;
        while(left<=right && top<=bottom){
            if(top<=bottom){
            for(int i=left;i<=right;i++){
                result[j]=matrix[top][i];
                j++;
                }
            }
            top++;
            if(left<=right){
            for(int i=top;i<=bottom;i++){
                result[j]=matrix[i][right];
                j++;
                }
            }
            right--;
             if( top<=bottom){
            for(int i=right;i>=left;i--){
                result[j]=matrix[bottom][i];
                j++;
                }
            }
            bottom--;
            if(left<=right ){
            for(int i=bottom;i>=top;i--){
                result[j]=matrix[i][left];
                j++;
                }
            }
            left++;
        }
        return result;
    }
};