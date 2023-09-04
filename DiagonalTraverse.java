// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Traverse the matrix by starting with the up direction, because the first row can't go upward 
// we have to change the direction, also by taking care that the last column once reached cannot be 
// incremented, direction is changed. Similarly, for the downward direction, the boundary cases are taken care of.

// Your code here along with comments explaining your approach

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int result[] = new int[m*n];  // declare the result array

        int i=0;
        int j=0;
        int dir=1; // to maintain the direction
        int idx = 0; // the index using which elements are entered into the result array

        while(idx<result.length){  
            result[idx] = mat[i][j];       // insert the element from mat to result
            idx++;

            if(dir==1){                     
                // up direction
                if(j==n-1){            // if it's the last column, go to next row and change direction
                    i++;
                    dir=-1;
                } else if(i==0){       // if it's the first row, move to next column and change direction
                    j++; 
                    dir=-1;
                } else {               // else continue moving upward to the next column
                    i--;
                    j++;
                }
            } else {
                // down direction
                if(i==m-1){            // if it's the last row, go to next column and change direction
                    j++;
                    dir=1;
                }else if(j==0){       // if it's the first column, move to next row and change direction
                    i++;
                    dir=1;
                } else {              // else continue moving downward to the next row
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}