/* Time Complexity: O(m*n); where m is the number f rows and n is the number of columns of the matrix given
Space Compelxity: O(1); if result array is not counted.

1. We basically use two pointers to tackle the problem (0:to move up and 1:to move down).
2. To handle the corner cases, that is, when we reach last row/column and when starting with teh very first row, we change the direction and increment or decrement the row/column accordingly.
3. Continue in the same manner to get the diagonal path.

*/

class Solution{
    public int[] findDiagonalOrder(int[][] matrix){
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0; int c = 0;
        int i = 0; int dir = 1;

        while(i < m*n){

            result[i] = matrix[r][c];
            if(dir == 1){
                if(c == n-1){
                    r++;
                    dir -= 1;
                }
            

                else if(r == 0){
                    c += 1;
                    dir -= 1;
                }

                else{
                    r--;
                    c++;
                }
            }

            else{
                if(r == m-1){
                    c++;
                    dir += 1;
                }

                else if(c == 0){
                    r++;
                    dir += 1;
                }

                else{
                    r++;
                    c--;
                }
            }

            i++;
        }
        return result;
    }
}