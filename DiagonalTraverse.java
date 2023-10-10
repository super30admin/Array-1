/* Time Complexity : O(m*n) 
 * 	m - no. of rows of the mat
 *  n - no. of cols of the mat  */
/* Space Complexity : O(1) - no auxiliary DS (excluding i/p and o/p array)*/
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; //row
        int n = mat[0].length; //column
        int[] result = new int[m*n];
        int index = 0;
        int i = 0;
        int j = 0;
        boolean dir = true;
        //index is less than lenght of the result array
        while(index < m*n){
            result[index] = mat[i][j];
            index++;

            //traversing up - dir
            if(dir){
                //first row except last col - increment col and change dir
                if(i==0 && j!= n-1){
                    j++;
                    dir = false;
                }else if(j == n-1){ // last col - increment row and change dir
                    i++;
                    dir = false;
                }else{//decrement row and increment col
                    i--;
                    j++;
                }
            }else{//traversing down - dir
                //first col except last row - increment row and change dir
                if(j==0 && i!= m-1){
                    i++;
                    dir = true;
                }else if(i == m-1){// last row - increment col and change dir
                    j++;
                    dir = true;
                }else{//decrement col and increment row
                    j--;
                    i++;
                }
            }
        }
        return result;
    }
}
