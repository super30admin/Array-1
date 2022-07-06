// Time Complexity : O(n*m) where n is rows and m is columns
// Space Complexity : O(1) because we have to return output array
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
if(mat == null || mat.length ==0) return new int[] {};
        
int n = mat.length; // rows
int m = mat[0].length; // columns

int[] result = new int[n*m];
//dir = 1 as upward and -1 as downward
int dir = 1; // setting the direction as upward on starting
int index = 0; // use to store the output in the array
int row=0,col=0;

while(index < m*n){
        result[index++]=mat[row][col];
        if(dir == 1){ // if the direction is upward
            if(col == m-1){ // when it reaches the last col
                dir = -1;
                row++;
            }else if(row ==0){ // when it reaches the first row
                dir = -1;
                col++;
            }else{ // normal condition when traversing the upward direction
                col++;
                row--;
            }
        }else{ // when dir ==-1, when the direction is downward
            if(row == n-1){ // when it reaches first column
                dir = 1;
                col++;
            }else if(col == 0){ // when it reches the first column
                dir =1;
                row++;
            }else{ // when it is normally traversing the downwrad direction
                col--;
                row++;
            }
        }
    }

return result;
}