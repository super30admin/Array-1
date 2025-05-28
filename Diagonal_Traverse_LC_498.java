/*Did this code successfully run on Leetcode :  Yes
Any problem you faced while coding this :  No



Time complexity - O(m*n)
Space complexity - O(m*n) */
public class Diagonal_Traverse_LC_498 {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int arr [] = new int [m*n];
        int i = 0, j =0;
        boolean flag = true;

        for(int idx = 0 ; idx<arr.length; idx++) {
            arr[idx] = matrix[i][j];
            //new position of i and j
            if(flag) {   //move in upward direction
                if(j == n-1){ //end of column
                    flag = false;
                    i++;
                } else if(i==0){ //first row
                    flag = false;
                    j++;
                } else {
                    i--;
                    j++;
                }
            } else { //move in downward direction

                if(i == m-1){ //end of column
                    flag = true;
                    j++;
                } else if(j==0){ //first row
                    flag = true;
                    i++;
                } else {
                    i++;
                    j--;
                }

            }

        }


        return arr;

    }
}