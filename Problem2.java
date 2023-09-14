// Time Complexity : O(n*m) as it is is looping through all elements in mat
// Space Complexity : O(1) as we are only storing in the array that is returned
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0 || mat == null){
            return new int[]{};
        }

        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int col = 0;
        int[] res = new int[m*n];

        //indicates moving from bottom to top
        int dir = 1;
        int index = 0;

        while(index < m*n){
            res[index] = mat[row][col];
            index++;
            if(dir == 1){
                if(col == n - 1){
                    dir = -1;
                    row++;
                }else if(row == 0){
                    dir = -1;
                    col++;
                }else{
                    row--;
                    col++;
                }
            }else if(dir == -1){
                if(row == m - 1){
                    dir = 1;
                    col++;
                }else if(col == 0){
                    dir = 1;
                    row++;
                }else{
                    col--;
                    row++;
                }
            }
        }

        return res;
    }
}
