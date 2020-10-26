//Time complexity: O(m*n)
//Space Complexity: O(1)
//Program ran successfully
//Made a few errors while writing this code, wrote the incorrect condition for the while loop on line number 16
/*  
    Algorithm: 1. Basic idea was to toggle directions when you reach an edge case
               2. Start by traversing upwards: column number increases, row decreases
               3. Edge case would be: if you are at the last col or if you are the first row
               4. If you are at the last col: increment row number and change direction
               5. If you are the first row: increment col number and change direction
               6. Follow the same logic while traversing in the downward direction
               7. Return when all the elements have been traversed
*/
class diagonalTraverse {
    
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[]{};
        int i = 0;
        int j = 0;
        int m = matrix.length;
        int n = matrix[0].length;
         int[] result = new int[m*n];
        int dir = 1;
        int index = 0;
        while(index < m*n){
            result[index] = matrix[i][j];
            index++;
            if(dir == 1){
                if(j == n-1){
                    i++;
                    dir = -1;
                }
                else if(i == 0){
                    j++;
                    dir = -1;
                }
                else{
                    i--;
                    j++;
                }
            }else{
                if(i == m-1){
                    j++;
                    dir = 1;
                }
                else if(j == 0){
                    i++;
                    dir = 1;
                }
                else{
                    i++;
                    j--;
                }   
            }
        }
        return result;
    }
}
