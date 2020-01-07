//Print elements diagnally

// Time Complexity : O(m*n) - m is the number of rows and n is the number of columns
// Space Complexity : O(1) - no extra space used

// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
/*
 There are two main cases : the direction is up and the direction is down.

 For each direction, handle the 2 edge cases and the normal case.

 See to that you put the edge cases in the right order,it might result in an index out of bound exception otherwise.

 */

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

        if(matrix.length == 0|| matrix ==  null)
            return new int[0];

        int m = matrix.length;
        int n= matrix[0].length;
        int[] result = new int[m*n];
        int row = 0;int col = 0;int dir = 1;
        int i = 0;
        //Loop iterates until we cover all elements
        while(i < m*n){
            //Add element to the matrix
            result[i] = matrix[row][col];
            //Directio is up
            if(dir == 1){
                //If last column i.e 4 in the above case[[1 2 3 4],[5,6,7,8]]
                if(col == n-1){
                    row ++;
                    dir = -1;
                }
                //If first element //i.e 1 in the above case
                else if(row == 0){
                    col++;
                    dir = -1;
                }

                //Normal case , see to that you do not change the direction
                else{
                    col++;
                    row -- ;

                }
            }
            //Direction is down . Reverse the variables above
            else{
                if(row == m-1){
                    col++;
                    dir =1;
                }
                else if(col == 0){
                    row ++ ;
                    dir =1;
                }
                else{
                    row ++;
                    col--;

                }
            }

            //Increment the index
            i++;
        }
        return result;
    }
}