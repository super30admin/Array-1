// Time Complexity : O(m*n) where  m*n is size of the matrix
// Space Complexity : O(1) not extra auxiliary space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/*Approach
 * Maintaining the direction and following the algo. dir=1 for up direction and
 * dir=-1 for  down direction
 * */

public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length==0) return new int[]{};

        int m = matrix.length;
        int n = matrix[0].length;
        int i=0, j=0, dir =1;
        int res[] = new int[m*n];
        int k=0;

        while(i<m && j<n){
            //Moving up direction
            if(dir==1){
                if(j==n-1){ // Make sure to check this case first, to prevent edge case failure
                    res[k++]=matrix[i][j];
                    i++; dir=-1;
                }
                else if(i==0){
                    res[k++]=matrix[i][j];
                    j++; dir=-1;
                }
                else {
                    res[k++]=matrix[i][j];
                    i--;j++;
                }
            }
            else { //Moving down direction
                if(i==m-1){
                    res[k++]=matrix[i][j];
                    j++; dir=1;
                }
                else if(j==0){
                    res[k++]=matrix[i][j];
                    i++; dir=1;
                }
                else {
                    res[k++]=matrix[i][j];
                    i++; j--;
                }
            }
        }
        return res;
    }
}