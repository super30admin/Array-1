// Time Complexity : O(n) where n is length of given array
// Space Complexity : O(1) because no use of extra data structure to process the output
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        //null check
        if( mat.length == 0 || mat == null ) return new int[0];
        
        int m = mat.length; //number of rows
        int n = mat[0].length; //number of columns
        int[] result = new int[m*n]; //result array of rows x columns
        int r = 0, c = 0; //new variables for rows and cols
        int i = 0, dir = 1; //i for while loop and dir for deciding direction
        
        while( i < m*n ) { // till the capacity of array
            result[i] = mat[r][c];
            i++;
            
            if( dir == 1 ) { //1 direction for upwards
                if( c == n-1 ) { //checking border condition, if col goes to last
                    dir = -1; //changing direction downwards
                    r++; //moving to next row
                }
                else if( r == 0 ) { //when dir is up but reached 1st row, can't go up
                    dir = -1; //changing direction downwards
                    c++; //moving to next col
                }
                else { //moving up but no border condition reached
                    c++; r--;
                }
                
            }
            
            else { //since dir is not 1, it must be -1, means downwards
                if( r == m-1) {
                    dir = 1; //changing direction upwards
                    c++; //moving next column
                }
                else if( c == 0 ) { //reached first col
                    dir = 1; //changing direction
                    r++; //next row
                }
                else { //no border condition
                    r++; c--; 
                }
                
            }
            
        }
        return result;
    }
}