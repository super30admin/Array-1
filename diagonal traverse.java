time complexity: O(numOfRows*numOfCols)
space complexity: O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
       if (mat.length == 0 || mat[0].length == 0) { //initial check
            return new int[]{};
        }
        
        int dir = 0; //dir = 0
        int x = 0;
        int y = 0;
        int numOfRows = mat.length; //number of rows
        int numOfCols = mat[0].length; //number of columns
        int[] ans = new int[mat.length * mat[0].length]; //creating a new array 
        
        for (int i = 0; i < numOfRows * numOfCols; i++) {
            ans[i] = mat[x][y];
            
            if ((x + y) % 2 == 0) {
                // If last column then go to next row
                if (y == numOfCols - 1) {
                    x++;
                }
                // If first row but not last column then go to next column
                else if (x == 0) {
                    y++;
                }
                // Go up
                else {
                    x--;
                    y++;
                }
            }
            else {
                // If last row then go to next column
                if (x == numOfRows - 1) {
                    y++;
                }
                // If first column but not last row then go to next row
                else if (y == 0) {
                    x++;
                }
                // Go down
                else {
                    x++;
                    y--;
                }
            }
        }
        
        return ans; //return array
    }
}