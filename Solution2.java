// TC: O(m*n) SC: O(1)
// Ran on leetcode: Yes
/*
Move up first checking for right and top boundry and move down looking for left and bottom boundry in diagonal manner
*/
class Solution2 {
    public int[] findDiagonalOrder(int[][] mat) {
        int rowLen = mat.length;
        int colLen = mat[0].length;

        int[] result = new int[rowLen * colLen];
        
        boolean dir = true;

        int row = 0;
        int col = 0;

        for(int i = 0; i < rowLen * colLen; i++){
            result[i] = mat[row][col];

            //move up
            if(dir){
                if(col == colLen - 1){
                    //right boundry
                    row++;
                    dir = false;
                } else if(row == 0){
                    //top boundry
                    col++;
                    dir = false;
                } else {
                    //move up
                    row--;
                    col++;
                }

            //move down    
            } else {
                if(row == rowLen - 1){
                    //left boundry
                    col++;
                    dir = true;
                } else if(col == 0){
                    //bottom boundry
                    row++;
                    dir = true;
                } else {
                    //move down
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}