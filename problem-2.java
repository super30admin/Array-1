// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Used a flag dir to track the direction and other logic is in comments

// Your code here along with comments explaining your approach


class problem-2 {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length==0){
            return new int[]{};
        }
        int r = mat.length;     //number of rows in the 2D matrix
        int c = mat[0].length;  //number of cols in the 2D matrix
        int result[] = new int[r * c];  //resultant 1D array would be of size r*c

        int row = 0;
        int col = 0;
        int index = 0;  //to keep track of elements in resultant array
        int dir = 1;    // dir decides the direction of traversal 1 -> bottom to up, -1 -> top to bottom

        while(index < r * c){
/*the direction & row or col are already adjusted from the previous iteration, so when we start the current iteration we just have to store it in the answer array and decide the direction of traversal*/
        result[index] = mat[row][col];
        index++;

        if(dir == 1){       //dir = 1 -> bottom to up
            if(col == c-1){
                row++;
                dir = -1;
            }
            else if(row == 0){
                col++;
                dir = -1;
            }
            else{
                row--;
                col++;
            }
        }
        else{           //dir = -1 -> top to bottom
            if(row == r-1){
                col++;
                dir = 1;
            }
            else if(col == 0){
                row++;
                dir = 1;
            }
            else{
                col--;
                row++;
            }
        }

        }
    return result;

    }
}