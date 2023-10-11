package S30.exercises;

// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on LeetCode : Yes
// Any problem you faced while coding this : No

// Approach: loop through the all the elements of the matrix and use a boolean direction flag and set it to true.
// Start each cell  data in the result array. While traversing up decrease the row index and increase the column index
// and make sure the column index is columns length, then change the flag value to false.
// While traversing down increase the row index and decrease the column index and make sure the row index is in boundries
// rows length and then make te boolean flag to true

public class FindDiagonalOrder {

    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int size = m * n;
        int[] result = new int[size];
        boolean traverseUp = true;
        int idx = 0, i = 0, j = 0;
        while(idx < size){
            result[idx] = matrix[i][j]; // store first cell info.
            idx ++;
            if(traverseUp){  // traverse Up
                if(i==0 && j != n-1){
                    j++;
                    traverseUp = false;
                }else if(j== n-1){
                    i++;
                    traverseUp = false;
                }else{
                    i--; j++;
                }
            }else{
                //traverse down
                if(j==0 && i != m-1){
                    i++;
                    traverseUp = true;
                }else if(i== m-1){
                    j++;
                    traverseUp = true;
                }else{
                    j--; i++;
                }
            }
        }
       return result;
    }
}
