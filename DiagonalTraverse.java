/*498. Diagonal Traverse
Time Complexity: O(m*n)
Space Complexity: O(1)
*/

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new int[0];
        int m = matrix.length; //Number of rows
        int n = matrix[0].length; //Number of columns

        int[] result = new int[m*n];
        int dir = 1; //upward direction

        int i =0, r = 0, c=0;
        while(i < m*n){
            result[i] = matrix[r][c];
            //going up
            if(dir==1){
                //Edge Case, this should be the first condition, since in r == 0, we are incrementing c++
                if(c == n-1){
                    r++;
                    dir = -1;
                }else if(r == 0){
                    c++;
                    dir = -1;
                }else{
                    c++;
                    r--;
                }
            }else{
                if(r == m-1){
                    c++;
                    dir = 1;
                }else if(c==0){
                    r++;
                    dir = 1;
                }else{
                    r++;
                    c--;
                }
            }
            i++;
        }
        return result;
    }
}