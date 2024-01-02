//54. Spiral Matrix

/*
Have 4 variables to traverse top, bottom, left, right
and add them to vector.
Time Complexity: O(m*n)
Space Complexity: O(1) in case Iterative solution; in case of recursive case, it takes the O(N)

*/
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
        /*
        //Iterative solution
        //TC: O(m*n)
        //SC: O(1)

        int m = matrix.size();
        int n = matrix[0].size();

        vector<int>ret;

        int top=0, bottom = m-1, left = 0, right = n-1;

        while(left <= right && top<=bottom){

            //going from left to right
            for(int j=left; j<=right; j++)
                ret.push_back(matrix[top][j]);
            top++; //squeeze the ceiling

            //going from top to bottom
            for(int i=top; i<=bottom; i++)
                ret.push_back(matrix[i][right]);
            right--;

            //check - there is a cross over
            //if(left > right || top > bottom) break;

            //going from right to left
            if(top <= bottom){
                for(int j=right; j>=left; j--)
                ret.push_back(matrix[bottom][j]);
            bottom--;
            }
            

            //going from bottom to top
            if(left <= right){
                for(int i=bottom; i>=top; i--)
                ret.push_back(matrix[i][left]);
            left++;
            }
            
        }
    
        
        return ret;

        */

        //Recursive solution
        //TC: O(m*n)
        //SC: 

        int m = matrix.size();
        int n = matrix[0].size();

        vector<int>ret;

        int top=0, bottom = m-1, left = 0, right = n-1;
        helper(matrix, top, bottom, left, right, ret);
        return ret;



    }

    void helper(vector<vector<int>> &matrix, int top, int bottom, int left, int right, vector<int> &ret){
        if(top>bottom || left>right) return;

        //going from left to right
            for(int j=left; j<=right; j++)
                ret.push_back(matrix[top][j]);
            top++; //squeeze the ceiling

            //going from top to bottom
            for(int i=top; i<=bottom; i++)
                ret.push_back(matrix[i][right]);
            right--;

            //check - there is a cross over
            //if(left > right || top > bottom) break;

            //going from right to left
            if(top <= bottom){
                for(int j=right; j>=left; j--)
                ret.push_back(matrix[bottom][j]);
            bottom--;
            }
            

            //going from bottom to top
            if(left <= right){
                for(int i=bottom; i>=top; i--)
                ret.push_back(matrix[i][left]);
            left++;
            }


        helper(matrix, top, bottom, left, right, ret);
    }
};