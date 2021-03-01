class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[0];
        // Rows = m , Columns = n
        int m = matrix.length; // 3
        int n = matrix[0].length; //3
        int[] result = new int[m*n]; //9
        
        // traverse the matrix
        int i =0 , direction =1 ;// direction 1 is upward , -1 is downward
        int col = 0 , row = 0;
        while(i < m*n){ //1< 9
            result[i] = matrix[row][col]; //result[1] = matrix[1][0] = 1
            // upward direction
            if(direction == 1){ // true
                if(col == n-1){ //col =0 , n-1 =2
                    row++ ; direction = -1;
                }
                else if(row == 0){
                    col++; direction = -1;
                }
                else{
                    row--; col++;
                }
            }
            else{
                if(row == m-1){
                    col++ ; direction = 1;
                }
                else if(col == 0){
                    row++; direction = 1;
                }
                else{
                    row++; col--;
                }
                
            }
            i++;
        }
        return result;
    }
}

// Time Complexity - O(m*n) , space complexity O(1)
