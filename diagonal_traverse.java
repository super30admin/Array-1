class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[] {}; // if the matrix is empty, we return the empty array.
        int m = mat.length; // m is the no. of rows in the matrix
        int n = mat[0].length; // n is the no. of cols in the matrix
        int dir = 1; // we take a direction variable which equals 1, which says that we are moving in the upward direction
        int[] result = new int[m*n]; // we create a 1d array of length m*n with name as result.
        int index = 0, i = 0, j = 0; // we take the index, i which is the row and j which is the col and initialized to 0;
        while(index < m*n ) {
            result[index] = mat[i][j];
            index++;
            if(dir == 1){
                if(j == n-1){ // if we are in the last col
                    dir = -1; // we change the direction;
                    i++; // we go to the next row.
                }
                else if(i == 0){ // if are in the 1st row. we are moving in the upward direction, we will definitely go to row 0
                    dir = -1; // we change the direction
                    j++; // we go to the next col;
                }
                else{ // general case - where we are moving upwards
                    i--; // i decrements
                    j++; // j increments
                }
            }
            else{ // here dir is -1;
                if(i == m-1){ // if we are in the last row
                    dir = 1; // we change the direction
                    j++;
                }
                else if(j == 0){
                    dir = 1;
                    i++;
                }
                else{ // general case - where we are moving downwards
                    i++; // i increments
                    j--; // j decrements
                }
            }
        }
        return result;
    }
}

//tc - O(m*n) and sc - O(1)