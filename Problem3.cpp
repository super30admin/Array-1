class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int>result;
        if(matrix.size()==0) return result;
        
        int left=0;
        int top=0;
        int bottom=matrix.size()-1;
        int right = matrix[0].size()-1;
        
          
        while(left<=right && top<=bottom)
        {
            // add top row. keep top constant. Iterate from Left->right.
            for(int i=left; i<=right; i++)
            {
                result.push_back(matrix[top][i]);
            }
        top++;
            
            //for right column
            for(int i=top;i<=bottom;i++)
        {
            result.push_back(matrix[i][right]);
        }
        right--;
         
             // for bottom row :
            if(top<=bottom)
        {
            for (int i=right ; i >=left; i--)
            {
                result.push_back(matrix[bottom][i]);
            }
        }
        bottom--;
            
            //for left  column
            if(left<=right)
        {
            for(int i=bottom;i>=top;i--)
            {
                result.push_back(matrix[i][left]);
            }
             
        }
        left++;
        }
        
        return result;
    }
};