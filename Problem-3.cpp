//Time Complexity = O(M*N)
//Space Complexity = O(1)
//Where M is the number of rows and N is the number of coloumns in the matrix.
//The space complexity is O(1) because the extra space (vector<int> ans) is the same which we our function is returning.
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int top=0,bottom=matrix.size()-1, left=0,right=matrix[0].size()-1,i; 
        vector<int> ans;
        while(top<=bottom && left<=right)
        {
            for(i=left;i<=right;i++)
                ans.push_back(matrix[top][i]);
            top++;
            for(i=top;i<=bottom;i++)
                ans.push_back(matrix[i][right]);
            right--;
            if(top<=bottom)                                           //here we are checking (top<=bottom) because the value of top has been modified and has to satisfy our while loop constraint.
            {
                for(i=right;i>=left;i--)
                    ans.push_back(matrix[bottom][i]);
            }
            bottom--;
            if(left<=right)                                           //here we are checking (left<=right) because the value of right has been modified and has to satisfy our while loop constraint.
            {
                for(i=bottom;i>=top;i--)
                    ans.push_back(matrix[i][left]);
            }
            left++;
        }
        return ans;
    }
};
