//The algorithm performs a diagonal traversal of the given matrix mat and stores the elements in the result array res. 
//It uses two pointers (i and j) to navigate through the matrix. 
//The traversal direction (dir) alternates between upwards and downwards along the diagonals, adjusting the pointers accordingly. 
//The time complexity is O(m * n), where m and n are the number of rows and columns in the matrix, and the space complexity is O(m * n) for the result array
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int i=0, j=0;
         int m = mat.length, n = mat[0].length;
        boolean dir = true;
        int [] res = new int[m*n];
       // int idx=0;
        for(int idx=0;idx<m*n;idx++){
            res[idx]=mat[i][j];
            if(dir){
                if(j==n-1){
                    i++;
                    dir = false;
                }
                else if(i==0){
                    j++;
                    dir = false;
                }
                else{
                    i--;j++;
                }
            }
            else{
                    if(i==m-1){
                    j++;
                    dir = true;
                }
                else if(j==0){
                    i++;
                    dir = true;
                }
                else{
                    j--;i++;
                }

            }
            
        }
        return res;
    }
}