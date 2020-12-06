//  ## Problem 2:
// Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

// Example:

// Input:

// [

// [ 1, 2, 3 ],

// [ 4, 5, 6 ],

// [ 7, 8, 9 ]

// ]

// Output: [1,2,4,7,5,3,6,8,9]

// Time complexity: O(m*n)
// Space complexity: O(1) as no auxillary array
// Idea- to maintain 2 different directions and according edge cases



class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        
        if(matrix.size()==0){
            vector<int> result;
            return result;
        }
        
        int m = matrix.size();
        int n= matrix[0].size();
        
        vector<int> result(m*n, 0);
        int index=0;
        
        int i = 0;
        int j = 0;

        int dir = 1;
        
        while(index < m*n){
             // cout<< index<< i << j <<endl;
            
            result[index] = matrix[i][j];
            
            //upward dir
            if( dir ==1){
                
                if (j==n-1){
                    dir = -1;
                    i++;
                }
                else if (i==0){
                    dir= -1;
                    j++;
                }
                else{
                    i--;
                    j++;
                }
            }
            
            //downward dir
            else{
                
                if(i==m-1){
                    dir = 1;
                    j++;
                }
                else if (j==0 ){
                    dir =1;
                    i++;
                }
                else{
                    i++;
                    j--;
                }
            }
            
           
            index++;
        }
        return result;
    }
};