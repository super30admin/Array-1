// Time Complexity : 0(m*n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes

class DiagonalArray {
    public int[] findDiagonalOrder(int[][] matrix) {

        if(matrix == null || matrix.length == 0)
            return new int[0];
        if(matrix[0].length == 0)
            return new int[0];

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] arr = new int[rows * cols];

        //dir = 1 up, dir = -1 down
        int i=0, j=0, idx = 0, dir=1;

        while(idx < arr.length){
            arr[idx] = matrix[i][j];
            if(dir == 1){
                if(j == cols - 1){
                    i++; dir = -1;
                }else if(i == 0){
                    j++; dir = -1;
                }else{
                    i--; j++;
                }
            }else{
                if(i == rows - 1){
                    j++; dir = 1;
                }else if(j == 0){
                    i++; dir = 1;
                }else{
                    i++; j--;
                }
            }
            idx++;
        }

        return arr;
    }
}