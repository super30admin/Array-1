class Solution {
    /*
    Time complexity: O(n*m)
    Space complexity: O(1)
    */
    
    public int[] findDiagonalOrder(int[][] matrix) {
        // check if the matrix is empty or not
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        
        int n = matrix.length;
        int m = matrix[0].length;
        int[] output = new int[n*m];
        int dir = 1;
        int index = 0;
        int i = 0;
        int j = 0;
        
        // check if the index is less than n*m
        while(index < (n*m)){
            // add value at i and j from matrix in the output array
            output[index] = matrix[i][j];
            index++;
            
                // check if the direction 1(up) or -1(down)
                if(dir == 1){
                // up direction(dir = 1)
                // check if j is within range
                if(j == m-1){
                    i++;
                    dir = -1;
                }
                else if (i == 0){
                    j++;
                    dir = -1;
                }
                else{
                    i--;
                    j++;
                }
                }else{
                // down direction(dir = -1)
                    // check if i is within range
                if(i == n-1){
                    j++;
                    dir = 1;
                }
                else if (j == 0){
                    i++;
                    dir = 1;
                }
                else{
                    i++;
                    j--;
                }
                }
            }
        return output;
    }
}