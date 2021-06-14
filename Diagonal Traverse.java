// Time Complexity : O(m * n)
// Space Complexity : O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int i = 0;
        int j = 0;
        int index = 0;
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int dir = 1; //up
        while( !(i == m - 1 && j == n - 1)){
            result[index++] = mat[i][j];
            //when going up
            if(dir == 1){
                //reached top right
                if(i == 0 && j == n - 1){
                    i++;
                    dir = -1;
                }
                //reached top row
                else if(i == 0){
                    j++;
                    dir = -1;
                }
                //reached last column
                else if(j == n - 1){
                    i++;
                    dir = -1;
                }
                //general case
                else{
                    i--;
                    j++;
                }
            }
            //when going down
            else{
                //reached bottom left
            	if(j == 0 && i == m - 1) {
            		j++;
            		dir = 1;
            	}
                 //reached first column
                else if(j == 0){
                    i++;
                    dir = 1;
                }
                //reached last row
                else if(i == m - 1){
                    j++;
                    dir = 1;
                }
                //general case
                else{
                    j--;
                    i++;
                }
            }
        }
        result[index] = mat[m - 1][n - 1];
        return result;
    }
}