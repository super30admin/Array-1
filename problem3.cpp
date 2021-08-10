//Time Complexity - O(M*N)
//Space Complexity - O(1)

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int>v;
        int m=matrix.size(),n=matrix[0].size(),top=0,left=0,right=n-1,bottom=m-1;;
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                v.push_back(matrix[top][i]);
            }
            top++;
            if(top<=bottom&&left<=right){
            for(int i=top;i<=bottom;i++){
                v.push_back(matrix[i][right]);
            }
            right--;}
            if(top<=bottom&&left<=right){
            for(int i=right;i>=left;i--){
                v.push_back(matrix[bottom][i]);
            }
            bottom--;}
            if(top<=bottom&&left<=right){
            for(int i=bottom;i>=top;i--){
                v.push_back(matrix[i][left]);
            }
            left++;}
        }
        return v;
    }
};