// ## Problem 3
// Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

// Example 1:

// Input:

// [

// [ 1, 2, 3 ],

// [ 4, 5, 6 ],

// [ 7, 8, 9 ]

// ]
// Output: [1,2,3,6,9,8,7,4,5]
// Example 2:

// Input:

// [

// [1, 2, 3, 4],

// [5, 6, 7, 8],

// [9,10,11,12]

// ]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]

// Time complexity: O(m*n)
// Space complexity: O(1) as no auxillary array
// Idea- to maintain 4 pointers- top, bottom ,left and right and then traverse in 4 directions



class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
         vector<int> output;
        if(matrix.size()==0){
            return output;
        }
        
        int top_row= 0;
        int bot_row= matrix.size()-1;
        int left_col = 0;
        int right_col= matrix[0].size()-1;
        
        while( left_col <= right_col && top_row <= bot_row){
        for( int i=left_col; i <=right_col; i++ ){
            
            output.push_back( matrix[top_row][i]);
        }
        top_row++;
        
        for(int j= top_row; j<=bot_row; j++){
          
            output.push_back( matrix[j][right_col]);
        }
        right_col--;
        
        if(top_row <= bot_row  && left_col <= right_col){
            for(int i= right_col ; i>= left_col; i--){
          
                output.push_back( matrix[bot_row ][i]);
            }
            bot_row--;
        }
            
        if( top_row <= bot_row && left_col <= right_col){
             for(int j= bot_row; j >= top_row; j--){
            
                output.push_back( matrix[j][left_col]);
         
            }
            left_col++;
        }
    }
        return output;
    }
};