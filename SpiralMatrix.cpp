//Time Complexity: O(m*n)
//SPace complexity: O(m*n)
//Approach: should have left right top and bottom pointrs to start traversing this matrix
//we do the initial set up and set the condition where we make sure that left is less than or equal to right and top is less than or equal to bottom
//there on we keep iterating each row and each column 
//setting the top bottom left right in mind;
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m=matrix.size(), n=matrix[0].size();
        int top=0, bottom=m-1, left=0, right=n-1;
        vector<int> result;

        while(left<=right and top<=bottom)
        {
            //move from left to right
            for(int i=left;i<=right;i++)
            {
                result.push_back(matrix[top][i]);
            }
            top++;
            //move from top to bottom
            for(int i=top;i<=bottom;i++)
            {
                result.push_back(matrix[i][right]);
            }
            right--;
             //moce from right to left
            if(top<=bottom)
            {
                 for(int i=right;i>=left;i--)
                {
                    result.push_back(matrix[bottom][i]);
                }
            bottom--;
            }
            //move from bottom to top
            if(left<=right)
            {
                for(int i=bottom;i>=top;--i)
                {
                    result.push_back(matrix[i][left]);
                }
                left++;
            }
            
        }
    return result;
    }
};